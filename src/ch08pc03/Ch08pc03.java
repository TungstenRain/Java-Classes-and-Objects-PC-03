package ch08pc03;
import java.util.Scanner;

/**
 * Carpet Calculator
 * Calculate the total cost of carpet based on user's input
 */
public class Ch08pc03 {

    public static void main(String[] args) {
        // Variables
        double length, width, cost;
                
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Request input from user
        System.out.print("Please enter the length of the room: ");
        length = keyboard.nextDouble();
        System.out.print("Please enter the width of the room: ");
        width = keyboard.nextDouble();
        System.out.print("Please enter the cost of the carpet per square foot: ");
        cost = keyboard.nextDouble();
        
        // Instantiate RoomDimension class
        RoomDimension dim = new RoomDimension(length, width);
        
        // Instantiate RoomCarpet class
        RoomCarpet carpet = new RoomCarpet(dim, cost);
        
        // Display results to user
        System.out.printf("The total cost for the carpet is: $%,.2f.\n", carpet.getTotalCost());
    }
    
}
