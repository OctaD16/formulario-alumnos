/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosYObjetos;

import conexionDB.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romer
 */
public class Registro_Alumnos {

    Conector cnt = new Conector();

    //metodo para buscar alumno si ya se encuentra registrado en la BD
    public boolean buscarAlumno(int dni) {
        String consulta = "SELECT * FROM alumnos WHERE dni = ?";
        try {
            PreparedStatement ps = cnt.conectar().prepareStatement(consulta);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("error buscar alumno" + e);
        }
        return false;
    }

    //metodo para borrar alumno de la base de datos, donde preparamos una consulta SQL
    // si el alumno con el dni indicado por parametro se encuentra en la base de datos, procedemos a borrarlo.
    public boolean borrarAlumno(int dni) {
        String consulta = "DELETE FROM alumnos WHERE dni = ?";
        try {
            PreparedStatement ps = cnt.conectar().prepareStatement(consulta);
            ps.setInt(1, dni);
            ps.execute();
            JOptionPane.showMessageDialog(null, "El Alumno ha sido borrado correctamente");
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return false;
    }

    //metodo para insertar alumno en la base de datos
    //desde la clase VentanaLogeado creamos un objeto de tipo alumno lleno y se lo pasamos como argumento
    //el metodo recibe el objeto y crea la consulta SQL en donde obtendremos los datos mencionados
    public void insertarAlumno(Alumno alumno) {

        int dni = alumno.getDni();
        String nombre = alumno.getNombre();
        String apellido = alumno.getApellido();
        String curso = alumno.getCurso();
        String consulta = "INSERT INTO alumnos (dni, nombre, apellido, curso) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = cnt.conectar().prepareStatement(consulta);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, curso);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Alumno insertado correctamente");
        } catch (Exception e) {
            System.out.println("error de insert" + e);
        }
    }

    //Metodo para modificar datos de alumno, donde recibimos como argumento un objeto de tipo alumno
    public void modificar(Alumno alumno) {

        //Condiciones para cambiar el nombre del alumno a la base de datos 
        if (!"".equals(alumno.getNombre())) {//si esto no es igual a una cadena vacia entonces realiza la modificacion
            String consNom = "UPDATE alumnos SET nombre = ? WHERE dni = ?";
            // Preparamos la consulta con la variable nombre obtenida del objeto
            try {
                PreparedStatement ps = cnt.conectar().prepareStatement(consNom);
                ps.setString(1, alumno.getNombre());
                ps.setInt(2, alumno.getDni());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Nombre modificado correctamente");
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
        //Condiciones para cambiar el apellido del alumno
        if (!"".equals(alumno.getApellido())) {//si el apellido del alumno no es igual a una cadena vacia, entonces realiza la modificacion
            String consApe = "UPDATE alumnos SET apellido = ? WHERE dni = ?";
            // Preparamos la consulta con la variable apellido 'nApe' obtenida del objeto
            try {
                PreparedStatement ps = cnt.conectar().prepareStatement(consApe);
                ps.setString(1, alumno.getApellido());
                ps.setInt(2, alumno.getDni());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Apellido modificado correctamente");

            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
        //Condiciones para cambiar el curso del alumno
        if (!"".equals(alumno.getCurso())) {//Si el curso del alumno NO es igual a una variable vacia, entonces realiza la modificacion
            String consCurso = "UPDATE alumnos SET curso = ? WHERE dni = ?";
            //Preparamops la consulta con la variable curso 'nCur' obtenida del objeto    
            try {
                PreparedStatement ps = cnt.conectar().prepareStatement(consCurso);
                ps.setString(1, alumno.getCurso());
                ps.setInt(2, alumno.getDni());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Curso modificado correctamente");

            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }
    
    //recibimos un objeto de tipo alumno y recibimos un objeto de tipo table 
    public void mostrarTabla(Alumno alumno, JTable tbAlumnos) {
        //Bloque de codigo donde creamos el modelo de tabla aderiendo las columnas
        //inicializacion de objto de tipo tablemodel 
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Curso");
        tbAlumnos.setModel(model);//con la tabla recibida seteamos el modelo con las columnas agregadas

        String[] data = new String[4]; // creamos un arreglo de tipo String de 4 dimensiones

        String consTabla = "SELECT * FROM alumnos";
        try {
            PreparedStatement ps = cnt.conectar().prepareStatement(consTabla);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {//recorremos en la base de datos la tabla e insertamos los datos en el arreglo
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data); //se adiere los datos a la fila
            }
            tbAlumnos.setModel(model);
        } catch (Exception e) {
            System.out.println("error" + e);
        }

    }

    //metodo para mostrar los datos del alumno, donde recibimos el objeto de tipo alumno y la tabla
    public void mostrarAlumno(Alumno alumno, JTable tbAlumnos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("DNI");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Curso");
        tbAlumnos.setModel(model);//con la tabla recibida seteamos el modelo con las columnas agregadas

        String[] data = new String[4]; // creamos un arreglo de tipo String de 4 dimensiones

        if (!"".equals(alumno.getDni())) {//si el dni no es igual a una cadena vacia, se ejecuta el siguiente codigo
            try {
                String consDni = "SELECT * FROM alumnos WHERE dni=?";

                PreparedStatement ps = cnt.conectar().prepareStatement(consDni);
                ps.setInt(1, alumno.getDni());
                ps.execute();

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {//recorremos en la base de datos la tabla e insertamos los datos en el arreglo
                    data[0] = rs.getString(1);
                    data[1] = rs.getString(2);
                    data[2] = rs.getString(3);
                    data[3] = rs.getString(4);
                    model.addRow(data); //se adiere los datos a la fila
                }
                tbAlumnos.setModel(model);
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
        if (!"".equals(alumno.getNombre())) {
            try {
                String consNom = "SELECT * FROM alumnos WHERE nombre=?";

                PreparedStatement ps = cnt.conectar().prepareStatement(consNom);
                ps.setString(1, alumno.getNombre());
                ps.execute();

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {//recorremos en la base de datos la tabla e insertamos los datos en el arreglo
                    data[0] = rs.getString(1);
                    data[1] = rs.getString(2);
                    data[2] = rs.getString(3);
                    data[3] = rs.getString(4);
                    model.addRow(data); //se adiere los datos a la fila
                }
                tbAlumnos.setModel(model);
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }

        if (!"".equals(alumno.getApellido())) {
            try {
                String consApe = "SELECT * FROM alumnos WHERE apellido=?";

                PreparedStatement ps = cnt.conectar().prepareStatement(consApe);
                ps.setString(1, alumno.getApellido());
                ps.execute();

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {//recorremos en la base de datos la tabla e insertamos los datos en el arreglo
                    data[0] = rs.getString(1);
                    data[1] = rs.getString(2);
                    data[2] = rs.getString(3);
                    data[3] = rs.getString(4);
                    model.addRow(data); //se adiere los datos a la fila
                }
                tbAlumnos.setModel(model);
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }

        if (!"".equals(alumno.getCurso())) {
            try {
                String consCur = "SELECT * FROM alumnos WHERE curso=?";

                PreparedStatement ps = cnt.conectar().prepareStatement(consCur);
                ps.setString(1, alumno.getCurso());
                ps.execute();

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {//recorremos en la base de datos la tabla e insertamos los datos en el arreglo
                    data[0] = rs.getString(1);
                    data[1] = rs.getString(2);
                    data[2] = rs.getString(3);
                    data[3] = rs.getString(4);
                    model.addRow(data); //se adiere los datos a la fila
                }
                tbAlumnos.setModel(model);
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }

}
