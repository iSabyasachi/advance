package test.java.generics;
import java.util.*;
/**
Item 26 : Don't use Raw Types
 */
class Stamp{
    public void cancel(){};
}
class Coin{
    public void cancel(){};
}
public class GenericsItem26{
    public static void main(String[] args){
        System.out.println("Hello GenericsDemo!!!");
        GenericsDemo obj = new GenericsDemo();
        //obj.funcOne();
        obj.funcTwo();
    }
    /**
    Item 26 : Don't use Raw Types
     */
    public void funcOne(){
        //WRONG : List stamps = new ArrayList<>(); 
        List<Stamp> stamps = new ArrayList<>();
        stamps.add(new Stamp());
        //stamps.add(new Coin()); // Throws Class Cast Exception
        for(Iterator i = stamps.iterator() ; i.hasNext() ; ){
            Stamp stamp = (Stamp)i.next();
            stamp.cancel();
        }
    }
    /**
    sub-typing rules for generics:
    List<String> is a subtype of the raw type List, but not of the parameterized type List<Object>
     */
    public void funcTwo(){
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0);
        System.out.println(s);
    }
    private static void unsafeAdd(List<?> list, Object obj){
        list.add("String");
    }

}