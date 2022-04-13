
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class ScientificCalculator {

    private static final Logger LOGGER = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {

            ScientificCalculator scientificCalculator = new ScientificCalculator();
            Scanner sc = new Scanner(System.in);
            boolean flag=true;
            int choice;
            while (flag) {
                System.out.println("Select the option: \n 1. Natural Logarithm\n 2. Power\n 3. Square root\n 4. Factorial\n 5. Exit\n");
                System.out.print("Enter your choice: ");
                try {
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the number: ");
                            double numberLog = sc.nextDouble();
                            System.out.println("Natural Logarithmic value of " + numberLog + " is: " + scientificCalculator.calLogarithm(numberLog));
                            break;

                        case 2:
                            System.out.print("Enter the base number: ");
                            double number = sc.nextDouble();
                            System.out.print("Enter the power: ");
                            double power = sc.nextDouble();
                            System.out.println("Power function: " + number + "^" + power + " = " + scientificCalculator.calPower(number, power));
                            break;

                        case 3:
                            System.out.print("Enter the number: ");
                            double numberSq = sc.nextDouble();
                            System.out.println("Square root of " + numberSq + " is: " + scientificCalculator.calSquareRoot(numberSq));
                            break;

                        case 4:
                            System.out.print("Enter the number: ");
                            int numberFact = sc.nextInt();
                            System.out.println("Factorial of " + numberFact + " is: " + scientificCalculator.calFactorial(numberFact));
                            break;
                        case 5:
                            System.out.println("Exit!!!!");
                            flag = false;
                            break;
                        default:
                            System.out.println("Input is invalid, please choose the  proper input.");
                    }

                } catch (Exception exception) {
                    System.out.println("Input is invalid, please choose the  proper input.");
                    LOGGER.error("Input is invalid, please choose the  proper input.");
                }
            }
    }

    public double calSquareRoot(double number) {
        double result = Math.sqrt(number);
        LOGGER.info("Square root of " + number + " is:" + result);
        return result;
    }

    public long calFactorial(int number) {
        int i = 1;
        long fact = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        LOGGER.info("Factorial of:" + number + " is:" + fact);
        return fact;
    }

    public double calLogarithm(double number) {
        double result = Math.log(number);
        LOGGER.info("Log of:" + number + " is:" + result);
        return result;
    }

    public double calPower(double number, double power) {
        double result = Math.pow(number, power);
        LOGGER.info("Power of:" + number + "^" + power + " is:" + result);
        return result;
    }

}
