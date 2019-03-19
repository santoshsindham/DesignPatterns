package behavioral.observer;

public class MessageSubscriberOne implements ObserverNew
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}