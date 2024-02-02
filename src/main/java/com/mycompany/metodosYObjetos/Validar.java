package com.mycompany.metodosYObjetos;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Octavio Diaz
 */
public class Validar {

    private static final String PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=]).{1,8}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    public static boolean validarContraseña(String contraseña) {
        return PASSWORD_PATTERN.matcher(contraseña).matches();
    }

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean validarCorreo(String correo) {
        return EMAIL_PATTERN.matcher(correo).matches();
    }

    // Método de creacion de Llave
    String LLAVE = "123";

    public SecretKeySpec crearClave(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }
    }

//Metodo de encriptacion
    public String Encriptar(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadenaEncriptada = Base64.getEncoder().encodeToString(encriptada);
            return cadenaEncriptada;

        } catch (Exception e) {
            return "Ups algo salió mal";
        }
    }

//metodo de desencriptacion
    public String Desencriptar(String desencriptar) {
        try {
            SecretKeySpec secretKeySpec = crearClave(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.getDecoder().decode(desencriptar);
            byte[] desencriptacion = cipher.doFinal(cadena);
            String cadenaDesencriptada = new String(desencriptacion);
            return cadenaDesencriptada;

        } catch (Exception e) {
            return "Ups algo salió mal";
        }
    }
}
