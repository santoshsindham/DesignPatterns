package behavioral.memento;

/*
Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.

 */
public class Main
{
    public static void main(String[] args)
    {
        Article article = new Article(1, "My Article");
        article.setContent("ABC");      //original content
        System.out.println(article);

        ArticleMemento memento = article.createMemento();   //created immutable memento

        article.setContent("123");      //changed content
        System.out.println(article);

        article.restore(memento);       //UNDO change
        System.out.println(article);    //original content
    }
}