import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        String typeOfOperation = s.next();

        Calculator calc = new Calculator();
        double result = calc.calculation(a, b, typeOfOperation);

        if(Calculator.err.equals(""))
           System.out.println(Math.round(result * 10000.0) / 10000.0);
        else
           System.out.println(Calculator.err);

    }
}

class Calculator {

    static String err;

    public  double calculation(double a, double b, String typeOfOperation) {
        double result = 0.0;
        switch (typeOfOperation) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                if(b == 0) {
                    err = "Cannot divide number by 0";
                    break;
                }
                result = a / b;
                break;

            default:
                err = "Please enter valid operation";
                break;
        }
        return result;
    }
}
