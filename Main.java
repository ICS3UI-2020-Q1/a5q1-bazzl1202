import java.util.Scanner;
/**
 * Asks user for integer and creates a multiplication table for said integer
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter integer
    System.out.println("Please enter an integer to create a multiplication table for");
    // create variable for user input
    int integer = input.nextInt();

    for(int count = 1; count <= 12; count++){
      // print to the user the muliplication table
      System.out.println(count + " X " + integer + " = " + (count*integer));
    }
    
  }
}
