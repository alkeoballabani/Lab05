import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emri: ");
        String emri = sc.nextLine();

        System.out.print("Mosha: ");
        int mosha = sc.nextInt();

        System.out.print("Koeficienti: ");
        double koef = sc.nextDouble();

        sc.nextLine();

        System.out.printf("Përshëndetje, %s! Mosha: %d, Koeficienti: %.2f.\n", emri, mosha, koef);
    }
}
