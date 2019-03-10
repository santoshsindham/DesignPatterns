package creational.singleton;

// This code is the correct implementation of the singleton pattern.
public class LazyInitialization {

    private static volatile LazyInitialization instance = null;

    private LazyInitialization(){

    }

    public static LazyInitialization getInstance(){

        if(instance == null){
            synchronized (LazyInitialization.class){
                //Double check
                if(instance == null) {
                    instance = new LazyInitialization();
                }
            }
        }
        return instance;
    }
}
