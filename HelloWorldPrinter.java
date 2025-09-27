
public class HelloWorldPrinter {

    private String language;

    public HelloWorldPrinter(String language) {
        this.language = language.toLowerCase();
    }

    public void printHelloWorld() {
        switch (language) {
            case "english" ->
                System.out.println("Hello, World!");
            case "hindi" ->
                System.out.println("नमस्ते, दुनिया!");
            case "spanish" ->
                System.out.println("¡Hola, Mundo!");
            case "french" ->
                System.out.println("Bonjour, le monde!");
            default ->
                System.out.println("Hello, World! (Default Language)");
        }
    }

    public void printMultipleTimes(int count) {
        for (int i = 0; i < count; i++) {
            printHelloWorld();
        }
    }
}
