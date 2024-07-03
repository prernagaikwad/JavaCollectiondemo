import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo
{

    public static void main(String[] args )
    {
        HashSet hs = new HashSet();  //default capacity 16 load factor 0.75

        //HashSet hs =new HashSet(100); // initial capacity 100
        //Hashset hs =new Hashset(100,(float)0.90);
        //HashSet<Integer>hs = new HashSet<Integer>();

        //add objects/elements into Hashset
        hs.add(100);
        hs.add(23);
        hs.add("Welcome");
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);  //[null, A, 100, 23, Welcome, true]  //Insertion order is not preserved

        //remove()
        hs.remove(23);
        System.out.println("after removing element:" +hs);

        //contains()
        System.out.println(hs.contains('A'));
        System.out.println(hs.contains("xyz"));
        System.out.println(hs.isEmpty());

        //Reading objects from hashset using for each loop

        /*for(Object e:hs)
        {
            System.out.println(e);
        } */

        Iterator it =hs.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
