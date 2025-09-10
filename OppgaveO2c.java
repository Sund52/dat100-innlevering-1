import java.util.Scanner;

public class OppgaveO2c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poengsum;

            while (true) {
                System.out.print("Skriv inn poengsum for student " + i + " : ");
                poengsum = in.nextInt();

                if (poengsum >= 0 && poengsum <= 100) {
                    break;
                } else {
                    System.out.println("Ugyldig poengsum. Prøv igjen.");
                }
            }    

            if (poengsum <= 39) {
                System.out.println("Du fekk karakter F");
            } else if (poengsum <= 49) {
                System.out.println("Du fekk karakter E");
            } else if (poengsum <= 59) {
                System.out.println("Du fekk karakter D");
            } else if (poengsum <= 79) {
                System.out.println("Du fekk karakter C");
            } else if (poengsum <= 89) {
                System.out.println("Du fekk karakter B");
            } else if (poengsum <= 100) {
                System.out.println("Du fekk karakter A");
            }
        }

        in.close();
    }
}
