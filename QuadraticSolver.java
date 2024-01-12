import java.util.*;
public class QuadraticSolver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Quadratic Solver!");
        System.out.println("Enter the 'a' value:");
        double a = input.nextDouble();
        System.out.println("Enter the 'b' value:");
        double b = input.nextDouble();
        System.out.println("Enter the 'c' value:");
        double c = input.nextDouble();

        double xval1 = (-b + Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);
        double xval2 = (-b - Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a);

        System.out.println("X Values are:" + xval1 + " and -4" + xval2);
    }
}