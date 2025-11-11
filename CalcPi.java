// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		if (args.length == 0) {
            System.err.println("Error: Please provide the number of terms.");
            return;
        }
	    
		int n = Integer.parseInt(args[0]);

		int i = 0;
		double calc = 0;
		double pi = 0;

		double numerator;
		

		while (i<n) {
			
			double denominator = (2.0*i + 1);
			
			if (i % 2 == 0) {
				numerator = 1.0;
			} else {
				numerator = -1.0;
			}

			calc += numerator / denominator;
			
			i++;
		}

		pi =