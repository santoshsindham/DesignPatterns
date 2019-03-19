package behavioral.strategy;

/*

Strategy pattern is used where we choose a specific implementation of algorithm or task in run time
– out of multiple other implementations for same task.
 */

public class Demo {
    public static void main(String[] args) {

        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();

        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Lokesh");

        System.out.println("====================");
   }
}