package test.primitive;
import java.util.*;
public class TestPrimitive{
    public static void main(String[] args){
        //System.out.println(countBits(1));
        System.out.println(Arrays.toString(getAllBits(10)));
    }
    public static byte[] getAllBits(int num){
        int size = 31;     
        byte[] bits = new byte[32];
        int i = size;      
        while(i >= 0){            
            bits[i] = getBit(num, size - i) ? (byte)1 : (byte)0;           
            i--;
        }
        return bits;
    }
    public static int getBitsValue(int num, int i){
        return (num & (1 << i));
    }
    public static boolean getBit(int num, int i){
        return ((num & (1 << i)) != 0);
    }
    public static short countBits(int x){
       short numBits = 0;
       while(x > 0){
        numBits += (x & 1);
        x >>>= 1;
       }
       return numBits;
    }
}