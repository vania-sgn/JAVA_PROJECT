package Part2;

public class Nov_9 {
    public static void main(String[] args) {
        int lightspedd=186000;
        int days = 1000;
        long seconds;
        long distance;

        seconds= days*24*60*60;
        distance=lightspedd*seconds;
        System.out.println("Za"+days+" days lights will pass about" + distance +" mill");
        System.out.println(seconds);

        double pi,r,a;
        r=10.8;
        pi=3.1416;
        a=pi*r*r;
        System.out.println(a);
    }
}
