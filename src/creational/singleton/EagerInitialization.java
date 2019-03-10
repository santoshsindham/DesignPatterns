package creational.singleton;

public class EagerInitialization {

    private static volatile EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return instance;
    }
}
