import java.util.Scanner;

public class OrderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Jep çmimin (në lekë): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Gabim: pritej numër decimal.");
            return;
        }
        double vlera = sc.nextDouble();
        sc.nextLine(); 


        System.out.print("Jep kodin e kuponit ('KUP5' ose 'KUP10'): ");
        String kupon = sc.nextLine();


        double zbritje = 0;
        if (kupon.equalsIgnoreCase("KUP5")) {
            zbritje = 0.05; 
        } else if (kupon.equalsIgnoreCase("KUP10")) {
            zbritje = 0.10; 
        }

        double shumaPasZbritjes = vlera * (1 - zbritje);


        System.out.print("Dëshiron dërgesën (po/jo)? ");
        String pergjigje = sc.nextLine();
        boolean deshironDergese = pergjigje.equalsIgnoreCase("po");


        System.out.printf("Çmimi origjinal: %.2f lekë%n", vlera);
        System.out.printf("Çmimi me zbritje: %.2f lekë%n", shumaPasZbritjes);
        System.out.printf("Dërgesë e dëshiruar: %b%n", deshironDergese);


        int totalLek = (int) Math.round(shumaPasZbritjes);
        System.out.println("Çmimi i rrumbullakosur (numër i plotë): " + totalLek + " lekë");
    }
}
