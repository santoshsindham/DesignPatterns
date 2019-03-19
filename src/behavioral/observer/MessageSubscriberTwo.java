package behavioral.observer;

public class MessageSubscriberTwo implements ObserverNew
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}