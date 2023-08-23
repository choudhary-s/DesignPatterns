package typesofpatterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("This is email notification");
    }
}
