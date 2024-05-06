/* Student Name: Mohamad Al Dakkak
 * Lab Professor: Islam Gomaa
 * Due Date: 2023-10-08
 * Modified: Created 2023-10-01, Modified 2023-10-04
 * Description: Cylinder Calculator for Assignment 01
 */
package cylinder;
import java.util.Scanner;
public class Main {
  
	 public static void main (String[] args) {
	 Cylinder cylinder = new Cylinder();// creating the cylinder
	 Scanner scanner = new Scanner(System.in);// Scanner

	  System.out.println("Welcom to my program"); // welcome massage
	  System.out.print("Enter cylinder radius: "); // asking for the radius

      double radius= scanner.nextDouble();
      cylinder.setRadius(radius); 

      System.out.print("Enter cylinder height: "); // asking for the height
      double height= scanner.nextDouble();

      cylinder.setHeight(height);
      double volume = cylinder.calculateVolume(cylinder.getRadius(), cylinder.getHeight());

      System.out.printf("The volume of the cylinder is: %.2f\n", volume); // display the volume of the cylinder
      System.out.print("Program by Mohamad Al Dakkak, Lab Section #311, Lab Professor Islam Gomaa");

      scanner.close();
      
  }
}
