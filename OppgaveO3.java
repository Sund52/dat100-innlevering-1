import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn eit heiltall : ");
        int n = in.nextInt();

        if (n > 0) {
            long resultat = 1;
            for (int i = 1; i <= n; i++) {
                resultat = resultat * i;
            }
            System.out.println(resultat);
        } else {
            System.out.println("Heiltallet må være positivt");
        }

        in.close();
    }
}
