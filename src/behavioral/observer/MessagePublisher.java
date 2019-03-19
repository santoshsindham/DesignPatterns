package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MessagePublisher implements Subject {

    private List<ObserverNew> observers = new ArrayList<>();

    @Override
    public void attach(ObserverNew o) {
        observers.add(o);
    }

    @Override
    public void detach(ObserverNew o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for(ObserverNew o: observers) {
            o.update(m);
        }
    }
}