package test.primitive;

public class TestPrimitive{
    public static void main(String[] args){
        System.out.println(countBits(1));
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