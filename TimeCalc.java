public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]);

        int Tmin = (hours*60) + minutes + minAdd;
        int Thours = Tmin/60;

        int Nhours = Thours % 24;
        int Nmin = Tmin - (Thours*60);

        String Phours = String.format("%02d", Nhours);
        String Pmin = String.format("%02d", Nmin);
        
         System.out.println(hours+":"+minutes+" "+minAdd);
         System.out.println(Phours+":"+Pmin);
        
       
    }
}
