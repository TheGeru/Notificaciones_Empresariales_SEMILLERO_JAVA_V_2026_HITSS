package notifications;

public record EmailNotification(
    String email,
    String subject,
    String message
) implements Notification {
    public EmailNotification{
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("El correo tiene un formato invalido, revisalo");
        }
    }
}
