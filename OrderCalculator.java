import java.util.Scanner;

public class Produkti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Produkt: ");
        String emriProduktit = scanner.nextLine();


        System.out.print("Sasia: ");
        int sasia = scanner.nextInt();
        if (sasia <= 0) {
            System.out.println("Gabim: Sasia duhet të jetë më e madhe se 0.");
            scanner.close();
            return;
        }

 
        System.out.print("Çmimi njësi: ");
        double cmimiNjesi = scanner.nextDouble();
        if (cmimiNjesi <= 0) {
            System.out.println("Gabim: Çmimi njësi duhet të jetë më i madh se 0.");
            scanner.close();
            return;
        }


        System.out.print("Kupon? (true/false): ");
        boolean kaKupon;
        if (scanner.hasNextBoolean()) {
            kaKupon = scanner.nextBoolean();
        } else {
            String kuponInput = scanner.next();
            if (kuponInput.equalsIgnoreCase("true")) {
                kaKupon = true;
            } else if (kuponInput.equalsIgnoreCase("false")) {
                kaKupon = false;
            } else {
                System.out.println("Gabim: Vlera e kuponit duhet të jetë true ose false.");
                scanner.close();
                return;
            }
        }

  
        double ndermjetese = sasia * cmimiNjesi;
        double TVSH = 0.10;
        double meTVSH = ndermjetese * (1 + TVSH);
        double kuponVlera = 0;
        if (kaKupon) {
            kuponVlera = meTVSH * 0.05;
        }
        double total = meTVSH - kuponVlera;

  
        int totalLek = (int) Math.round(total);

         
        System.out.println("Ndërmjetëse: " + ndermjetese);
        System.out.println("Me TVSH (10%): " + meTVSH);
        if (kaKupon) {
            System.out.println("Kupon -5%: " + kuponVlera);
        }
        System.out.println("Totali (lek): " + totalLek);

        scanner.close();
    }
}
