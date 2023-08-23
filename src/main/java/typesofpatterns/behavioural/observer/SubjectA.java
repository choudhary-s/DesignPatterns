package typesofpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject {
    int state;
    List<Observer> observerList;
    public SubjectA(){
        state = 0;
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observerList){
            o.receiveNotification();
        }
    }
    @Override
    public void setState(int n){
        state = n;
        notifyObservers();
    }
}
