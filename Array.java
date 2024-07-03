import java.io.*;
import java.util.*;

public class Array
{
    public static void main(String[] args)
    {
        String arr[]={"Dog","cat","elephant"};
        for(String value:arr)
        {
            System.out.println(value);
        }
        ArrayList al =new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }


}
