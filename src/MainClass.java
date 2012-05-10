import customStructures.*;

public class MainClass
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        LinkedQueue<String> q = new LinkedQueue<String>();
        
        q.enqueue("first");
        q.enqueue("second");
        q.enqueue("third");
        println("size: " + q.size());
        for(int i = 0 ; i < 3; i++)
            println(q.dequeue());
    }

    public static void println(final String str)
    {
        System.out.println(str);
    }
}
