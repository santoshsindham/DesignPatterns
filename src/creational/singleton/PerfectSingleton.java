package creational.singleton;

import java.io.Serializable;

//Singleton enables an application to have one and only one instance of a class per JVM.
public class PerfectSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private PerfectSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {
        public static final PerfectSingleton INSTANCE = new PerfectSingleton();
    }

    public static PerfectSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}