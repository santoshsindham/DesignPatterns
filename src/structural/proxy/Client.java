package structural.proxy;

/*
In proxy design pattern, a proxy object provide a surrogate or placeholder for another object to control access to it.
Proxy is heavily used to implement lazy loading related usecases where we do not want to create full object until it is actually needed.
 */
public class Client
{
    public static void main(String[] args)
    {
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}
