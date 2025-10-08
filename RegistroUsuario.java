package git;

import java.util.regex.Pattern;

public class RegistroUsuario {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public boolean registrarUsuario(String nombre, String email) {
        if (nombre == null || nombre.isEmpty() || email == null || email.isEmpty()) {
            return false;
        }

        // Validación del email con regex
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            System.out.println("Error: email inválido -> " + email);
            return false;
        }

        System.out.println("Usuario registrado: " + nombre + " con email " + email);
        return true;
    }
}

