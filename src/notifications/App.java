package notifications;

public class App {
    public static void main(String[] args) {
        Notification[] notifications = new Notification[3];
        
        notifications[0] = new EmailNotification("brandonalonso@4567890gmail.com", "Hola", "como estas?");
        notifications[1] = new PushNotification("HJLAPQWE128794A#45", "Recibiste una transferencia");
        notifications[2] = new SmsNotification("4142195705", "Hola, ¿Como estas?");

        NotificationStatistics stats = NotificationProcessor.processor(notifications);
        NotificationProcessor.showInformationNotifications(stats);
        
    }
}
