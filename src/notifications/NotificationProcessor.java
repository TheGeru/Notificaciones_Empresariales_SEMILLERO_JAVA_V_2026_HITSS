package notifications;

public class NotificationProcessor {

    public static NotificationStatistics processor(Notification[] notifications) {

        NotificationStatistics stats = new NotificationStatistics();

        for(Notification notification : notifications){
            switch (notification) {
                case EmailNotification email -> {
                    stats.incrementEmail();
                }
                case PushNotification push -> {
                    stats.incrementPush();
                }
                case SmsNotification sms -> {
                    stats.incrementSMS();
                }
                default -> System.out.println("NOTIFICACION NO INDENTIFICADA");
            }
        };
        return stats;
    }

    public static void showInformationNotifications(NotificationStatistics stats){
        System.out.println("======RESUMEN=======");
        System.out.println("Correos enviados: " + stats.getCountEmail());
        System.out.println("SMS enviados:" + stats.getCountSMS());
        System.out.println("Push enviados: " + stats.getCountPush());
        System.out.println("Total: " + stats.totalNotifications());
    }
}
