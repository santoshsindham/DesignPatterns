package structural.composite;

/*
Composite design pattern helps to compose the objects into tree structures to represent whole-part hierarchies.
Composite lets clients treat individual objects and compositions of objects uniformly.
 */
public class Client
{
    public static void main(String[] args)
    {
        // Creating a component tree
        Component component = new CompositeAccount();

        // Adding all accounts of a customer to component
        component.add(new DepositAccount("DA001", 100));
        component.add(new DepositAccount("DA002", 150));
        component.add(new SavingsAccount("SA001", 200));

        // getting composite balance for the customer
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);

//        AccountStatement mergedStatement = component.getStatement();
        //System.out.println("Merged Statement : " + mergedStatement);
    }
}