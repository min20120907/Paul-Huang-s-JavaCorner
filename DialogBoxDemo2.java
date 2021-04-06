/* Demonstrating dialog boxes for input and output of numbers
   Anderson, Franceschi
*/

import javax.swing.JOptionPane;
import java.util.Scanner;
public class DialogBoxDemo2
{
  public static void main( String [] args )
  {
     String input = JOptionPane.showInputDialog( null,
           "Please enter your name" );
     String name = input;
     Scanner s = new Scanner(name);
     String first = s.next();
     JOptionPane.showMessageDialog( null, "your first name is " + first 
	        ); 
  }
}
