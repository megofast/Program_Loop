import java.util.Scanner;

public class Program_Loop {
    public static void main(String args[]) {
        boolean loop;
        Scanner scanner = new Scanner(System.in);
        int input;
        loop = true;
        do {
            System.out.println("Make your selection from below.");
            System.out.println("1. Hamburger");
            System.out.println("2. Cheeseburger");
            System.out.println("3. Bacon Cheeseburger");
            System.out.println("4. Double Cheeseburger");
            System.out.println("5. Double Bacon Cheeseburger");

            System.out.print("Make your selection: ");
            try {
                input = Integer.valueOf(scanner.next());
            } catch(Exception e) {
                input = 0;
            }

            if (input < 1 || input > 5) {
                System.out.println("Invalid selection, Please make another");
            } else {
                switch (input) {
                    case 1: System.out.println("Hamburger");
                        break;
                    case 2: System.out.println("Cheeseburger");
                        break;
                    case 3: System.out.println("Bacon Cheeseburger");
                        break;
                    case 4: System.out.println("Double Cheeseburger");
                        break;
                    case 5: System.out.println("Double Bacon Cheeseburger");
                        break;
                        default: System.out.println("Error...");
                }
                loop = false;
            }
        } while (loop == true);
    }
}
