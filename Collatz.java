// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]);
		String mode = (args[1]);
		int k = seed;

		if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		

		if (mode.equals("v")) {

			for (int s = 1; s <= 1; s++) {
				StringBuilder sequence = new StringBuilder();
				int i = 1;
				while (i <= seed) {
				
					while (seed != 1) {
				
						if (seed % 2 == 0) {
							seed = seed / 2;

						} else {
							seed = (seed*3) + 1;
						}

					sequence.append(seed).append(" ");	
				
					i++;
					}

					System.out.println(sequence+" ");
				
				}	
			
					System.out.println("Every one of the first " + k + " hailstone sequences reached 1.");
			}
		}

		

	}
}
