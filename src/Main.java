
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);


        System.out.println("Enter the Length and Breadth of Rectangle");
        float l = sc.nextInt();
        float br = sc.nextInt();
        float area = l*br;
        System.out.println("area of rectangle:" + area);

        System.out.print("Enter rectangle length and breadth: ");
        double l1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        System.out.println("Rectangle area = " + (l1 * b1));

        System.out.print("Enter square side: ");
        double side = sc.nextDouble();
        System.out.println("Square area = " + (side * side));

        System.out.print("Enter circle radius: ");
        double r = sc.nextDouble();
        System.out.println("Circle area = " + (Math.PI * r * r));



    }
}