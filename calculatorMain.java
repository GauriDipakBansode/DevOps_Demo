import java.util.*;

public class calculatorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("==========This is the calculator=========\n");
        calculator cal = new calculator();
        int ch = 0;
        System.out.print("Enter the first no.:: ");
        int a = sc.nextInt();
        System.out.print("Enter sec no.:: ");
        int b = sc.nextInt();

        while(ch<=4){
            System.out.println("--------Menu--------\n");
            System.out.println("1.Addition.\n2.Sub.\n3.Multiplication.\n4.Division.\n5.Exit.");

            System.out.println("Enter your choice:: ");
            ch = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Addition of two numbers is "+ cal.add(a,b));
                break;

                case 2: System.out.println("Sub of two numbers is "+ cal.sub(a,b));
                break;

                case 3: System.out.println("Mul of two numbers is "+ cal.mul(a,b));
                break;

                case 4: System.out.println("div of two numbers is "+ cal.div(a,b));
                break;
            }

        }
    }
}
