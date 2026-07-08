package notifications;

public record PushNotification(String token, String menssage) implements Notification {

    public PushNotification{
        if(token.isBlank() || token == null){
            throw new IllegalArgumentException("EL TOKEN ESTA VACIO");
        }    
    }
}
