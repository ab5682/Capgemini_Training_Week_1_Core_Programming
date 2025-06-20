
public class nine {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        
        double m = (y2 - y1) / (x2 - x1);
        
        double b = y1 - m * x1;
        
        result[0] = m;  
        result[1] = b;  
        
        return result;
    }

    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
