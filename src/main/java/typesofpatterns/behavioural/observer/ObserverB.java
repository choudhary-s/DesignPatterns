package typesofpatterns.behavioural.observer;

public class ObserverB implements Observer {
    @Override
    public void receiveNotification() {
        System.out.println("State change notification received in Observer B");
    }
}
