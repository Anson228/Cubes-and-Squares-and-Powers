package cubes.and.squares.and.powers;
import java.util.Scanner;
public class CubesAndSquaresAndPowers {

    public static void main(String[] args) {
        // Create the scanner object to read input from the user
        Scanner keyInput = new Scanner(System.in);
        // variables needed...
        int number;
        int option;
        int counter = 0;
        
            while(counter == 0) {
            System.out.println("Please enter the number of option(1/2/3/4)");
            option = keyInput.nextInt();   
        
            //if expression...
            if (option ==  1)
            {
                System.out.println("Please enter a number!");
                number = keyInput.nextInt();
                number = number * number;
                System.out.println("The square of this number is " + number);
            }
            else if (option ==  2)
            {
                System.out.println("Please enter a number!");
                number = keyInput.nextInt();
                number = number * number * number;
                System.out.println("The square of this number is " + number);
            }
            else if (option ==  3)
            {
                System.out.println("Please enter a number!");
                number = keyInput.nextInt();
                System.out.println("Please enter a power!");
		    int power = keyInput.nextInt();
		    int result = 1;
		    for(int i=0; i< power; i++) {
		    result= result*number;
                    System.out.println(result);
            }
                    
            }
            // if option is 4,then, sign out
            else if (option == 4) 
                    {
                        counter++;
                    System.out.println("Thank you");
                    }     
            }
        }           
    }
        
        
    
    
    

