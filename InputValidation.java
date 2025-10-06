import java.util.Scanner;

public class LexoCmimin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Çmimi bazë (lek): ");
        int base = scanner.nextInt();


        if (base <= 0) {
            System.out.println("Gabim: Çmimi bazë duhet të jetë më i madh se 0.");
            scanner.close();
            return;
        }


        System.out.print("A je nxënës? (true/false): ");
        boolean isStudent;

        if (scanner.hasNextBoolean()) {
            isStudent = scanner.nextBoolean();
        } else {
            String input = scanner.next();
            if (input.equalsIgnoreCase("true")) {
                isStudent = true;
            } else if (input.equalsIgnoreCase("false")) {
                isStudent = false;
            } else {
                System.out.println("Gabim: Vlera për nxënës duhet të jetë true ose false.");
                scanner.close();
                return;
            }
        }


        System.out.println("→ Lexim OK: base=" + base + ", isStudent=" + isStudent);

        scanner.close();
    }
}

