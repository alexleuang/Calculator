import java.nio.file.ProviderMismatchException;
import java.util.Scanner;



    public class App {

        static final Scanner inputScanner = new Scanner(System.in);
    
        private static String getString(String prompt) {
            System.out.println(prompt);
            String stringInput = inputScanner.nextLine();
            return stringInput;
      
            }
          
          private static double getDouble(String prompt) {
              System.out.println(prompt);
              double doubleInput = inputScanner.nextDouble();
              inputScanner.nextLine();
              return doubleInput;
            }
    
        public static void main(String[] args) {
            
            double num1 = getDouble("enter one number");
            double num2 = getDouble( "Enter Second Number:"); 
    
            Calculator calculator = new Calculator();
    
            double addResult = calculator.add(num1 ,num2);
            System.out.println(addResult);
    
            double subResult = calculator.sub(num1 ,num2);
            System.out.println(subResult);
    
            double multiResult = calculator.multi(num1 ,num2);
            System.out.println(multiResult);
    
            double divideResult = calculator.divide(num1 ,num2);
            System.out.println(divideResult);
          }
    
        
    }
      
    
    
