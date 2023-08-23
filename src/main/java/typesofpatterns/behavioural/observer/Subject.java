package typesofpatterns.behavioural.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setState(int n);
}
