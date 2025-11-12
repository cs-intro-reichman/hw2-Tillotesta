// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number.");
            return;
        }

        double calc = 0.0; 
        
        for (int i = 0; i < n ; i++) {
            double denominator = (2.0 * i + 1.0); 
            double numerator = (i % 2 == 0) ? 1.0 : -1.0;
            calc += numerator / denominator;
        }

        double pi = calc * 4.0;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + pi); 

    }
}