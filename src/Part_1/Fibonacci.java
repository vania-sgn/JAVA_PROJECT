/*package Part_1;

public class Fibonacci {
    public static void main(String[] args) {
        int lo=1;
        int hi=1;
        System.out.println (lo);
        while (hi<50){
            System.out.println(hi);
            hi=lo+hi;
            lo=hi-lo;

        }
    }
}*/
package Part_1;

public class Fibonacci {
    public static void main(String[] args) {
        int lo=2;
        int hi=4;
        System.out.println (lo);
        while (hi<500){
            System.out.println(hi);
            hi=lo*hi;
            lo=hi/lo;
            System.out.println(hi);
            System.out.println(hi);

        }
    }
}