import java.util.Scanner;

public class OppgaveO1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt : ");
        int bruttoinntekt = in.nextInt();
        
        double sats = 0.0;

        if (bruttoinntekt <= 217400)  {
            sats = 0.0;
        } else if (bruttoinntekt > 217401 && bruttoinntekt < 306050) {
            sats = 0.017;
        } else if (bruttoinntekt > 306051 && bruttoinntekt < 697150) {
            sats = 0.04;
        } else if (bruttoinntekt > 697151 && bruttoinntekt < 942400) {
            sats = 0.137;
        } else if (bruttoinntekt > 942401 && bruttoinntekt < 1410750) {
            sats = 0.167;
        } else {
            sats = 0.177;
        }

        double trinnskatt = bruttoinntekt * sats;

        System.out.println("Du skal betale " + trinnskatt + " kr i trinnskatt");
        
        in.close();
    }
}