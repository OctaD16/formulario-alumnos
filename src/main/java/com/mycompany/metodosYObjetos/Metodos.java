package com.mycompany.metodosYObjetos;
//librerias para base de datos

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexionDB.Conector;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//librerias para encriptado
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Properties;
//librerias de correo
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Metodos {
    // Crear una instancia del objeto Conector para gestionar la conexión a la base de datos
    Conector cnt = new Conector();

//    metodo buscarUsuario, crea una consulta SQL en donde verifica si el usuario se encuentra en la base de datos
//    le damos como parametro una String donde se verificara el correo
//    la finalidad de este metodo es saber si ya hay un usuario registrado.
    public boolean buscarUsuario(String correo) {
        try {
            String query = "SELECT * FROM registro WHERE correo=?";
            PreparedStatement preparedStatement = cnt.conectar().prepareStatement(query);
            preparedStatement.setString(1, correo);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                // Si hay una fila en el resultado, significa que el usuario fue encontrado
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Algo salió mal en el método buscarUsuario: " + e);
        }
        return false;
    }
    //metodo insertUser 
    public void insertUser(Persona persona) {
        String sql = "INSERT INTO registro (usuario, correo, contrasenia) VALUES (?,?,?)";
        try {
            PreparedStatement ps = cnt.conectar().prepareStatement(sql);
            ps.setString(1, persona.getUsuario());
            ps.setString(2, persona.getCorreo());
            ps.setString(3, persona.getContraseña());
            ps.execute();
            JOptionPane.showMessageDialog(null, "CUENTA REGISTRADA");
        } catch (Exception e) {
            System.out.println("error de insert" + e);
        }
    }

   
    
//metodo para enviar correos
    public void enviarCorreo(String correo) {
        Validar valid = new Validar();
   
        Metodos mt = new Metodos();
        try {
            String query = "SELECT * FROM registro WHERE correo=?";
            PreparedStatement preparedStatement = cnt.conectar().prepareStatement(query);
            preparedStatement.setString(1, correo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String pass = rs.getString(4);
                try {
                    Properties propiedades = new Properties();

                    propiedades.put("mail.smtp.host", "smtp.gmail.com");
                    propiedades.put("mail.smtp.starttls.enable", "true");
                    propiedades.put("mail.smtp.port", 587);
                    propiedades.put("mail.smtp.auth", "true");

                    String correoEmisor = "iesmbprogramacion@gmail.com";
                    String contrasena = "lihcjdgsxtieadjh";
                    String asunto = "Recuperacion de contraseña";
                    String mensaje = "Su contraseña es: " + valid.Desencriptar(pass);;

                    if (correoEmisor != null && contrasena != null && asunto != null && mensaje != null) {
                        String receptor = correo;
                        if (receptor != null && !receptor.isEmpty()) {
                            Session sesion = Session.getDefaultInstance(propiedades);
                            MimeMessage message = new MimeMessage(sesion);
                            message.setFrom(new InternetAddress(correoEmisor));
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
                            message.setSubject(asunto);
                            message.setText(mensaje);

                            Transport transport = sesion.getTransport("smtp");
                            transport.connect(correoEmisor, contrasena);
                            transport.sendMessage(message, message.getAllRecipients());
                            transport.close();
                            JOptionPane.showMessageDialog(null, "Correo Enviado");
                        }
                    }
                } catch (HeadlessException | MessagingException e) {
                }
            }
        } catch (SQLException e) {
        }

    }
    
//metodo para enviar reporte
    public void enviarReporte(String correo) {
        Document doc = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/reporte.pdf"));
            doc.open();

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("DNI");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Curso");

            try {
                Conector cnt = new Conector();
                PreparedStatement ps = cnt.conectar().prepareStatement("select * from alumnos");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    } while (rs.next());
                    doc.add(tabla);
                } else {
                    JOptionPane.showMessageDialog(null, "no se encontraron datos");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            String query = "SELECT * FROM registro WHERE correo=?";
            PreparedStatement preparedStatement = cnt.conectar().prepareStatement(query);
            preparedStatement.setString(1, correo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
//                String pass = rs.getString(4);
                try {
                    Properties propiedades = new Properties();

                    propiedades.put("mail.smtp.host", "smtp.gmail.com");
                    propiedades.put("mail.smtp.starttls.enable", "true");
                    propiedades.put("mail.smtp.port", 587);
                    propiedades.put("mail.smtp.auth", "true");

                    String correoEmisor = "iesmbprogramacion@gmail.com";
                    String contrasena = "lihcjdgsxtieadjh";
                    String asunto = "Reporte de Alumnos";
                    String mensaje = "su documento ";

                    if (correoEmisor != null && contrasena != null && asunto != null && mensaje != null) {
                        String receptor = correo;
                        if (receptor != null && !receptor.isEmpty()) {
                            Session sesion = Session.getDefaultInstance(propiedades);
                            MimeMessage message = new MimeMessage(sesion);
                            message.setFrom(new InternetAddress(correoEmisor));
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
                            message.setSubject(asunto);

                            // Crear el cuerpo del mensaje
                            BodyPart cuerpoMensaje = new MimeBodyPart();
                            cuerpoMensaje.setText(mensaje);

                            // Crear el adjunto
                            MimeBodyPart adjunto = new MimeBodyPart();
                            String rutaPDF = System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "reporte.pdf";

                            adjunto.attachFile(new File(rutaPDF));

                            // Combinar cuerpo del mensaje y adjunto
                            Multipart multipart = new MimeMultipart();
                            multipart.addBodyPart(cuerpoMensaje);
                            multipart.addBodyPart(adjunto);

                            // Establecer el contenido del mensaje
                            message.setContent(multipart);

                            Transport transport = sesion.getTransport("smtp");
                            transport.connect(correoEmisor, contrasena);
                            transport.sendMessage(message, message.getAllRecipients());
                            transport.close();
                            transport.close();
                            JOptionPane.showMessageDialog(null, "Correo Enviado");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
        }
    }
    public boolean contieneNumero(String cadena) {
    for (char c : cadena.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
}
    
}
