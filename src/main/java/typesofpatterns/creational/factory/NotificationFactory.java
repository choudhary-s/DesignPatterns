package typesofpatterns.creational.factory;

public class NotificationFactory {
    public Notification getNotificationInstance(String channelName){
        switch (channelName){
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                return new EmailNotification();
        }
    }
}
