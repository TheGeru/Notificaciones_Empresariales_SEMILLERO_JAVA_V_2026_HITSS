package notifications;

public class NotificationStatistics {
    private int countEmail = 0;
    private int countSMS = 0;
    private int countPush = 0;

    // METODOS GET ----------------------------------------
    public int getCountEmail() {
        return countEmail;
    }

    public int getCountSMS() {
        return countSMS;
    }

    public int getCountPush() {
        return countPush;
    }

    // METODOS DE INCREMENTO --------------------

    public void incrementEmail() {
        countEmail++;       
    }

    public void incrementSMS() {
        countSMS++;
    }

    public void incrementPush() {
        countPush++;
    }

    public int totalNotifications(){
        return countEmail + countPush + countSMS;
    }

}
