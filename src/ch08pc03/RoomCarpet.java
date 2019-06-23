package ch08pc03;

/**
 * RoomCarpet Class
 */
public class RoomCarpet {
    // Fields
    private RoomDimension size;
    private double carpetCost;
    
    // Constructors
    /**
     * Construct the RoomCarpet class with variables
     * @param dim RoomDimension The room's dimensions
     * @param cost double The room's cost
     */
    public RoomCarpet (RoomDimension dim, double cost) {
        size = dim;
        carpetCost = cost;
    }
    
    // Methods
    /**
     * Get the total cost
     * @return double The total cost of the carpet
     */
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }
    
    /**
     * Convert results to string
     * @return String The RoomCarpet converted to string format
     */
    @Override
    public String toString() {
        return "The carpet cost is: " + carpetCost + " and " + size.toString();
    }
}
