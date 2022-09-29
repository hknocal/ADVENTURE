import java.util.Scanner;

public class UI {

    public void startUI() {
        Adventure adventure = new Adventure();
        Player player = new Player ();
        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        System.out.println("""
                    Welcome to our text adventure
                    """);

        while (stop == false) {
            System.out.println("""
                    Type go north if you wish to go north
                    Type go south if you wish to go south
                    Type go east if you wish to go east
                    Type go west if you wish to go west
                    
                    Type help for list of options and useful information.
                    Type look 
                    
                    """);
            String userInput = sc.nextLine().toLowerCase();
            switch (userInput) {
                case "go north":
                    boolean canGoNorth = adventure.goNorth();
                    if (canGoNorth) {
                        System.out.println("Going north");
                    }
                    else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "go south":
                    boolean canGoSouth = adventure.goSouth();
                    if (canGoSouth) {
                        System.out.println("Going south");
                    }
                    else {
                        System.out.println("You can't got that way");
                    }
                    break;
                case "go east":
                    boolean canGoEast = adventure.goEast();;
                    if (canGoEast) {
                        System.out.println("Going east");
                    }
                    else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "go west":
                    boolean canGoWest = adventure.goWest();
                    if (canGoWest) {
                        System.out.println("Going west");
                    }
                    else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "help":
                    System.out.println("""
                    Typing "Look" and pressing enter --> Your character looks around the current room the person is in, highlighting usable object.
                    Typing "Exit" and pressing enter --> Closes the program. Your progress wont be saved!
                    Typing North and pressing enter --> Checks to see if you can move north. Informing the player if its doable.
                    Typing East and pressing enter --> Checks to see if you can move East. Informing the player if its doable.
                    Typing West and pressing enter --> Checks to see if you can move West. Informing the player if its doable.
                    Typing South and pressing enter --> Checks to see if you can move south. Informing the player if its doable.
                            """);
                    break;
                case "look":
                    System.out.println(adventure.look());
                    break;
                case "exit":
                    System.out.println("Closing adventure."); //works
                    stop = true;
                    break;


            }

        }
    }
}