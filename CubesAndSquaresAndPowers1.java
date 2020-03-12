
package cubes.and.squares.and.powers1;
import java.util.Scanner;
public class CubesAndSquaresAndPowers1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        
        int number;
        int option;
        int counter = 0;
        
        
        System.out.println("Please enter the number of option(1/2/3/4)");
            option = keyInput.nextInt();           

            while(counter == 0) {
            
        
            
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
		    int power= keyInput.nextInt();
		    int result= 1;
		    for(int i=0; i<power; i++) {
		    result= result*number;
                    System.out.println(i);
            }
                    
            }
            
            else if (option == 4) 
                    {
                        counter++;
                    System.out.println("Thank you");
                    }     
            }
                }           
        }
    

    

