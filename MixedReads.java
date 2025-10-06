import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter address: ");
        String adresa = scanner.nextLine();


        System.out.print("Enter postal code: ");
        int posta = scanner.nextInt();


        System.out.print("Enter weight in kg: ");
        double peshaKg = scanner.nextDouble();


        scanner.nextLine();


        System.out.println("Adresa: " + adresa + ", Kodi postar: " + posta + ", Pesha(kg): " + peshaKg);

        scanner.close();
    }
}
