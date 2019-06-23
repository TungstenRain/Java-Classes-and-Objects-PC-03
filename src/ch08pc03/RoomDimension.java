package ch08pc03;

/**
 * Room Dimension Class
 */
public class RoomDimension {
    // Fields
    private double length, width;
    
    // Constructors
    /**
     * Construct the RoomDimension class with variables
     * @param len double The room's length
     * @param w double The room's width
     */
    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }
    
    // Accessors, Mutators, and Methods
    /**
     * Get the area of the room
     * @return double The room's area
     */
    public double getArea() {
        return length * width;
    }
    
    /**
     * Convert the RoomDimension to string format
     * @return String The RoomDimension in string format
     */
    @Override
    public String toString() {
        return "The length is: " + length + " and the width is: " + width;
    }
}
