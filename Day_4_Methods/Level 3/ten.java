public class ten {

    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;

        boolean collinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (collinearUsingSlope) {
            System.out.println("Points A, B, and C are collinear using slope formula.");
        } else {
            System.out.println("Points A, B, and C are not collinear using slope formula.");
        }

        boolean collinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearUsingArea) {
            System.out.println("Points A, B, and C are collinear using area formula.");
        } else {
            System.out.println("Points A, B, and C are not collinear using area formula.");
        }
    }
}
