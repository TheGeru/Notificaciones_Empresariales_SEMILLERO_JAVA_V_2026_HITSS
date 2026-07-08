package notifications;

public record SmsNotification(String cellphone, String mensaje) implements Notification{

    public SmsNotification{
    
        if (cellphone.length() != 10 ) {
            throw new IllegalArgumentException("EL NUMERO NO PUEDE TENER MENOS O MAS DE 10 DIGITOS");
        }

        for(int i = 0; i < cellphone.length(); i++){
            if (!Character.isDigit(cellphone.charAt(i))) {
                throw new IllegalArgumentException("EL NUMERO DEBE CONTENER UNICAMENTE DIGITOS");
            }
        }
    }
}
