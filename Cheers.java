//feedback

// very clean good!


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String word = args[0];
                int n = Integer.parseInt(args[1]);
                String uword = word.toUpperCase();

                int charc = uword.length();
                int i = 0;

                while (i < charc) {
                     char ch = uword.charAt(i);
                     
                     if (ch=='A' || ch=='E' || ch=='F' || ch=='H' || ch=='I' || ch=='L' || ch=='M' || ch=='N' || ch=='O' || ch=='R' || ch=='S' || ch=='X') {
                        System.out.println("Give me an "+ch+": "+ch+"!");
                     } else {
                        System.out.println("Give me a  "+ch+": "+ch+"!");
                     }
                     
                     i++;
                }
	   
                System.out.println("What does that spell?");

                int j = 0;
                while (j<n) {
                        System.out.println(uword+"!!!");
                        j++;
                }
        }
}
