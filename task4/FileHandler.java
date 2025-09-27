
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public void readFileBuffered() {
        System.out.println("\n--- Reading file: " + fileName + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void readFileFiles() {
        System.out.println("\n--- Reading file using Files.lines(): " + fileName + " ---");
        Path path = Path.of(fileName);
        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void writeFile(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void appendFile(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(text + "\n");
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    public void fileStatistics() {
        int lines = 0, words = 0, chars = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                chars += line.length();
            }
            System.out.println("\n--- File Statistics ---");
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void searchWord(String word) {
        boolean found = false;
        int lineNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(word)) {
                    System.out.println("Found at line " + lineNumber + ": " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Word not found in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
