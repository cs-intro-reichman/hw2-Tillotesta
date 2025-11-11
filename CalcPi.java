// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int n = Integer.parseInt(args[0]);

		if (args.length == 0) {
   
    	return;

		int i = 0;
		int j = 0;
		double calc = 0;
		double pi = 0;

		double numerator;
		

		while (i<n && j<n) {
			
			double denominator = (2.0*i + 1);
			
			if (i % 2 == 0) {
				numerator = 1.0;
			} else {
				numerator = -1.0;
			}

			calc += numerator / denominator;
			
			j++;
			i++;
		}

		pi = calc * 4.0;

		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+pi);

	}
}
