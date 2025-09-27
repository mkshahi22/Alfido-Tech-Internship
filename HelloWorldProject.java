
import java.util.Scanner;

public class HelloWorldProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        System.out.println("===== Hello World Project =====");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Print Hello World in English");
            System.out.println("2. Print Hello World in Hindi");
            System.out.println("3. Print Hello World in Spanish");
            System.out.println("4. Print Hello World in French");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            HelloWorldPrinter printer;

            switch (choice) {
                case 1, 2, 3, 4 -> {
                    String language = switch (choice) {
                        case 1 ->
                            "english";
                        case 2 ->
                            "hindi";
                        case 3 ->
                            "spanish";
                        case 4 ->
                            "french";
                        default ->
                            "english";
                    };

                    printer = new HelloWorldPrinter(language);
                    System.out.print("How many times to print? ");
                    int count = sc.nextInt();
                    sc.nextLine(); // consume newline
                    printer.printMultipleTimes(count);
                }
                case 5 -> {
                    exit = true;
                    System.out.println("Exiting Hello World Project. Goodbye!");
                }
                default ->
                    System.out.println("Invalid choice! Please select 1-5.");
            }
        }

        sc.close();
    }
}
