import java.util.Scanner;

public class DivisionExample {

    
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

        
            int result = divide(num1, num2);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
    
            System.out.println("Error: " + e.getMessage());
        } finally {
        
            System.out.println("Program end. ");
            sc.close();
        }
    }
}