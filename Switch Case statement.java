public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0.0;
        
        switch (ch) {
            case 1: // Calculate area of the circle
                double r = a[0];
                area = Math.PI * r * r;
                break;
                
            case 2: // Calculate area of the rectangle
                double l = a[0];
                double b = a[1];
                area = l * b;
                break;
                
            default:
                System.out.println("Invalid choice");
                return 0.0;
        }
        
        // Round the result to 5 decimal places
        return Math.round(area * 100000.0) / 100000.0;
    }
    
    // Sample test cases to demonstrate functionality
    public static void main(String[] args) {
        // Test Case 1: Rectangle with length = 3, breadth = 2
        double[] rectDimensions = {3, 2};
        System.out.println(areaSwitchCase(2, rectDimensions)); // Expected output: 6.00000

        // Test Case 2: Circle with radius = 3
        double[] circleRadius = {3};
        System.out.println(areaSwitchCase(1, circleRadius)); // Expected output: 28.27433
    }
}
