package samples;

public class JDIExampleDebuggee {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;


        int total = a + b;

        add();

        System.out.println(total);
        System.out.println("Debuggee running");


    }

    public static void add(){
        int a2 = 5;
        int b2 = 10;

        int total2 = a2 + b2;
        System.out.println(total2);
    }
}
