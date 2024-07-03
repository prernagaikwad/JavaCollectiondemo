import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapdemo {
    public static void main(String[] args) {
        //HashMap m = new HashMap();
        HashMap <Integer,String> m=new HashMap<Integer,String>();

        m.put(101, "John");
        m.put(102, "David");
        m.put(103, "scott");
        m.put(104, "Marry");
        m.put(105, "Tye");
        m.put(103, "x");
        m.put(106, "David");

        System.out.println(m);
        System.out.println(m.get(105));
        m.remove(106);
        System.out.println(m);
        System.out.println(m.containsKey(101));
        System.out.println(m.containsValue("Marry"));
        System.out.println(m.containsValue("Y"));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());  //returns all the keys as set
        // System.out.println(m.values());  //returns all the values as collection
        //System.out.println(m.entrySet());//returns all the entries as set

        for (Object i : m.keySet()) {
            System.out.println(i);
        }

        System.out.println(m.values());

        for (Object i : m.values()) {
            System.out.println(i);
        }
        for (Object i : m.keySet()) {
            System.out.println(i+"       "+m.get(i));
        }
        //Entry methods
        for(Map.Entry entry:m.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        //iterator()
        Set s=m.entrySet();
        Iterator it =s.iterator();
            while(it.hasNext())
            {
                Map.Entry entry = (Map.Entry) it.next();
                System.out.println(entry.getKey()+"   "+entry.getValue());
            }
    }
}
