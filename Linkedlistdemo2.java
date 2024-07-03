import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistdemo2
{
    public class LinkedListDemo2
    {
        public static void main(String[] args)
        {

            LinkedList linkedList =new LinkedList();

            linkedList.add("x");
            linkedList.add("Y");
            linkedList.add("Z");
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");

            LinkedList new_l =new LinkedList();
            new_l.addAll(linkedList);
            System.out.println(new_l);
            new_l.removeAll(linkedList
            );
            System.out.println(new_l);
            // sort()  Collection.sort(collection)

            System.out.println("Before sorting:" +linkedList);
            Collections.sort(linkedList);
            System.out.println("after sorting:"+linkedList);
            //reverse order
            Collections.sort(linkedList,Collections.reverseOrder());
            System.out.println("Reverse order:"+ linkedList);

            //shuffling
            Collections.shuffle(linkedList);
            System.out.println("After shuffling:"+linkedList);
        }

    }
}
