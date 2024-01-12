import java.util.*;
public class QuadraticSolver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Quadratic Solver! The following program solves problems with the equation Ax^2+Bx+C");
        System.out.println("Enter the 'a' value:");
        double a = input.nextDouble();
        System.out.println("Enter the 'b' value:");
        double b = input.nextDouble();
        System.out.println("Enter the 'c' value:");
        double c = input.nextDouble();

        double xval1 = 0.0;
        double xval2 = 0.0;
        double discriminant = (Math.pow(b,2)-(4*a*c));
        
        if(discriminant > 0){
           xval2 = ((-b - Math.sqrt(discriminant)) / (2*a));
           xval1 = ((-b + Math.sqrt(discriminant)) / (2*a));
           System.out.println("The solutions are:"+ xval1 +" and "+ xval2);

        } else if (discriminant == 0){
            xval1 = ((-b)/(2*a));
            System.out.println("The solution is:"+ xval1);

        } else if (discriminant < 0){
            System.out.println("No real solutions found :(");
        }
    }
}