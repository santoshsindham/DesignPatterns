package behavioral.observer;

public interface Subject
{
    public void attach(ObserverNew o);
    public void detach(ObserverNew o);
    public void notifyUpdate(Message m);
}