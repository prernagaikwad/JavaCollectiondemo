import java.util.LinkedList;

public class  Queuedemo
{
    public static void main(String[] args)
    {
        LinkedList q = new LinkedList();

        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(100);

        System.out.println(q);

    }

}
