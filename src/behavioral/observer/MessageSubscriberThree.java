package behavioral.observer;

public class MessageSubscriberThree implements ObserverNew
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}