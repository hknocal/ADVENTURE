import java.util.Arrays;
import java.util.Scanner;

public class UI {

    private Adventure adventure = new Adventure();
    private Player player = new Player();
    //private Room room = new Room();
    private Scanner sc = new Scanner(System.in);

    public void startUI() {
        boolean stop = false;

        System.out.println("""
                Welcome to our text adventure
                """);

        while (stop == false) {
            System.out.println("""
                    -------------------------------------------
                    Type go north if you wish to go north
                    Type go south if you wish to go south
                    Type go east if you wish to go east
                    Type go west if you wish to go west
                                        
                    Type help for list of options and useful information.
                    Type look 
                    -------------------------------------------
                                        
                    """);
            String userInput = sc.nextLine().toLowerCase();
            switch (userInput) {
                case "go north":
                    boolean canGoNorth = player.goNorth();
                    if (canGoNorth) {
                        System.out.println("Going north");
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "go south":
                    boolean canGoSouth = player.goSouth();
                    if (canGoSouth) {
                        System.out.println("Going south");
                    } else {
                        System.out.println("You can't got that way");
                    }
                    break;
                case "go east":
                    boolean canGoEast = player.goEast();
                    ;
                    if (canGoEast) {
                        System.out.println("Going east");
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "go west":
                    boolean canGoWest = player.goWest();
                    if (canGoWest) {
                        System.out.println("Going west");
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "inventory":
                    System.out.println(player.getPlayerInventory());
                    break;
                case "take item":
                    System.out.println(player.getCurrentRoom().getItems());
                    System.out.println("Enter the number of the item you wanna remove");
                    int itemtakeNumber = sc.nextInt();
                    Item item = player.getCurrentRoom().getItems().get(itemtakeNumber);
                    player.getCurrentRoom().getItems().remove(itemtakeNumber);
                    player.addItem(item);
                    System.out.println("You have taken: " + item);
                    System.out.println("You have taken the following objects " + player.getPlayerInventory());
                    break;

                case "drop":
                    System.out.println("Test1");
                    break;
                case "take":
                    System.out.println("test2");
                    break;
                case "help":
                    System.out.println("""
                            -------------------------------------------
                            Typing "Look" and pressing enter --> Your character looks around the current room the person is in, highlighting usable object.
                            Typing "Exit" and pressing enter --> Closes the program. Your progress wont be saved!
                            Typing North and pressing enter --> Checks to see if you can move north. Informing the player if its doable.
                            Typing East and pressing enter --> Checks to see if you can move East. Informing the player if its doable.
                            Typing West and pressing enter --> Checks to see if you can move West. Informing the player if its doable.
                            Typing South and pressing enter --> Checks to see if you can move south. Informing the player if its doable.
                            -------------------------------------------
                                    """);
                    break;
                case "look":
                    System.out.println(player.look());
                    break;
                case "exit":
                    System.out.println("Closing adventure."); //works
                    stop = true;
                    break;


            }

        }
    }
}