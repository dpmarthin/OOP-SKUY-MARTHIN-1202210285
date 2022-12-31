import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static boolean repeat = true;
    private static Scanner scannerName = new Scanner (System.in);
    public static void main (String[] args) throws Exception {
        do {
            try {
                System.out.println("EAD Areas Calculator");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. Exit");
                System.out.print("Input your choice: ");
                int choice = scannerName.nextInt();
                scannerName.nextLine(); 
                Calculation calc = new Calculation ();              
                switch (choice) {
                    case 1 :
                        System.out.print ("Input side of Square: ");
                        double squareSide = scannerName.nextDouble ();
                        scannerName.nextLine ();
                        calc.setSquare (squareSide);                        
                        break;
                    case 2 :
                        System.out.print("Input radius of Circle: ");
                        double circleRadius = scannerName.nextDouble();
                        scannerName.nextLine();
                        calc.setCircle(circleRadius);
                    break;
                    case 3 :
                        System.out.print("Input upper side of Trapezoid: ");
                        double trapezoidUpper = scannerName.nextDouble();
                        scannerName.nextLine();
                        System.out.print("Input lower side of Trapezoid: ");
                        double trapezoidLower = scannerName.nextDouble();
                        scannerName.nextLine();
                        System.out.print("Input height of Trapezoid: ");
                        double trapezoidHeight = scannerName.nextDouble();
                        scannerName.nextLine();
                        calc.setTrapezoid(trapezoidUpper, trapezoidLower, trapezoidHeight);
                        break;
                    case 0 :
                        System.out.println("Program finished");
                        repeat = false;
                        break;                   
                    default :
                        continue;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input, please try again");
                scannerName.nextLine();
            } catch (IllegalArgumentException iae) {
                System.out.println (iae.getMessage());   
            } catch (InterruptedException ie) {
                ie.printStackTrace ();
            }          
        } while (repeat);  
        scannerName.close ();
    }
}
