// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		// Argument check
		if (args.length < 2) {
			System.err.println("Usage: java Collatz <seed> <c|v>");
			return;
		}

		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int k = seed;

		if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}

		if (mode.equals("v")) {

			int i = 1;

			while (i <= k) {
				int n = i;
				int steps = 1; 
				System.out.print(n); 

				
				if (n == 1) {
					n = 4;
					System.out.print(" " + n);
					steps++;
				}

				while (n != 1) {
					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = (n * 3) + 1;
					}
					System.out.print(" " + n);
					steps++;
				}

				System.out.println(" (" + steps + ")");
				i++;
			}

			System.out.println("Every one of the first " + k + " hailstone sequences reached 1.");
		}
	}
}

