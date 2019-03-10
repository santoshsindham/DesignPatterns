package creational.singleton;

import java.io.Serializable;

public class ReadResolveSingleton implements Serializable {
    private volatile static ReadResolveSingleton instance = null;

    public static ReadResolveSingleton getInstance() {
        if (instance == null) {
            instance = new ReadResolveSingleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}