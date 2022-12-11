package test;
import java.util.*;
/**
Problem Statement : 
Problem TestCase :
Algorithm :
Time Complexity :
Space Complexity :
 */

public class HelloWorld{
	public static void main(String[] args) {
		int[] oldArray = new int[]{1,2,3,4,5};
        int[] newArray = new int[oldArray.length];
        Arrays.copyOf(newArray);
        System.out.println(Arrays.toString(newArray));
	}
    
}