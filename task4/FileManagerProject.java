
import java.util.Scanner;

public class FileManagerProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        System.out.println("===== Welcome to File Manager Project =====");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Read a file (BufferedReader)");
            System.out.println("2. Read a file (Files.lines())");
            System.out.println("3. Write to file (overwrite)");
            System.out.println("4. Append text to file");
            System.out.println("5. File statistics (lines, words, characters)");
            System.out.println("6. Search for a word in file");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter file name (with extension): ");
                String fileName = sc.nextLine();
                FileHandler fileHandler = new FileHandler(fileName);

                switch (choice) {
                    case 1 ->
                        fileHandler.readFileBuffered();
                    case 2 ->
                        fileHandler.readFileFiles();
                    case 3 -> {
                        System.out.print("Enter text to write: ");
                        String text = sc.nextLine();
                        fileHandler.writeFile(text);
                    }
                    case 4 -> {
                        System.out.print("Enter text to append: ");
                        String text = sc.nextLine();
                        fileHandler.appendFile(text);
                    }
                    case 5 ->
                        fileHandler.fileStatistics();
                    case 6 -> {
                        System.out.print("Enter word to search: ");
                        String word = sc.nextLine();
                        fileHandler.searchWord(word);
                    }
                }
            } else if (choice == 7) {
                exit = true;
                System.out.println("Exiting File Manager. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select 1-7.");
            }
        }

        sc.close();
    }
}
