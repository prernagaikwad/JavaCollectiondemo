
import java.util.*;
public class ArrayListDemo
{
   public static void main(String[] args)
   {
       //Declare ArrayList
       //ArrayList <Integer> a= new ArrayList<Integer>();
       //ArrayList <String> a = new ArrayList<String>();
       //List a= new ArrayList();

       ArrayList all = new ArrayList();

       //add elements to the ArrayList
       all.add(true);
       all.add("A");
       all.add("Welcome");
       all.add(15.5);

       System.out.println(all);

       //size()
       System.out.println("Number of elements in array list :"+all.size());
       all.remove(1);
       System.out.println("After removing element from array list"+all);
       all.add(2,"python");
       System.out.println("After insertion :"+all);
       //retreive specific element
       System.out.println(all.get(2));

       //change element /replace
       all.set(2,"c#");
       System.out.println("after replacing element:"+all);
       System.out.println(all.contains("c#"));
       System.out.println(all.contains("C++"));
       //isEmpty()
       System.out.println(all.isEmpty());

       //for loop
       System.out.println("Reading elements using for loop-------");
       for(int i=0;i<all.size();i++)
       {
           System.out.println(all.get(i));
       }
       // for ..each loop
       System.out.println("Redaing elements using for..each loop");
       for(Object e:all)
       {
           System.out.println(e);
       }

       //iterator()
       System.out.println("Reading elements using iterator");

       Iterator it =all.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }

   }

}
