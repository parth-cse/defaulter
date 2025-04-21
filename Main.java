public class Main {
    public static void main(String[] args) {
        // Create a new instance of the Game class
        Game game = new Game();
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("To Start Press Enter");
        // Wait for user input to start the game   
        try {
            System.in.read(); // Wait for Enter key
            if( System.in.read() == '\n') {
                game.start(); // Start the game
            } else {
                System.out.println("Invalid input. Please press Enter to start the game.");
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        // Start the game
        
    }
}