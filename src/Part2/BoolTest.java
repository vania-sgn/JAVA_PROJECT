package Part2;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b= false;
        System.out.println(" b equels  " + b);
        b=true;
        System.out.println(" b equels  " + b);


        if(b)
            System.out.println("The code is executed");
        b=true;
        //b=false;
        if (b)
            System.out.println(" The code is not executed");
        System.out.println("10>9 is "+ (10>9));
    }
}
