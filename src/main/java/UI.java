import java.util.Scanner;

public class UI {

    private Adventure adventure = new Adventure();
    private Player player = new Player();
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
                    
                    Enter inventory if you wish to see current item inventory
                    Enter take item if you wish to take an item in your inventory
                    Enter drop item if you wish to drop an item in your inventory
                    
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
                case "n":
                    boolean canGoNorth2 = player.goNorth();
                    if (canGoNorth2) {
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
                case "s":
                    boolean canGoSouth2 = player.goSouth();
                    if (canGoSouth2) {
                        System.out.println("Going south");
                    } else {
                        System.out.println("You can't got that way");
                    }
                    break;
                case "go east":
                    boolean canGoEast = player.goEast();
                    if (canGoEast) {
                        System.out.println("Going east");
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "e":
                    boolean canGoEast2 = player.goEast();
                    if (canGoEast2) {
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
                case "w":
                    boolean canGoWest2 = player.goWest();
                    if (canGoWest2) {
                        System.out.println("Going west");
                    } else {
                        System.out.println("You can't go that way");
                    }
                    break;
                case "inventory":
                    System.out.println(player.inventoryShow());
                    break;
                case "take item":
                    System.out.println("Enter the number of the item you wanna remove");
                    for (int i = 0; i < player.getCurrentRoom().getItems().size(); i++) {
                        System.out.println(i + ":" + player.getCurrentRoom().getItems().get(i));
                    }
                    int itemtakeNumber = sc.nextInt();
                    Item item = player.getCurrentRoom().getItems().get(itemtakeNumber);
                    player.getCurrentRoom().getItems().remove(itemtakeNumber);
                    player.addItem(item);
                    System.out.println("You have taken: " + item);
                    System.out.println("You have taken the following objects " + player.getPlayerInventory());
                    break;

                case "drop item":
                    //TODO create fail safe for entering other than int
                    System.out.println("Enter the number of the item you wanna drop");
                    for (int i = 0; i <player.getPlayerInventory().size(); i++){
                        System.out.println(i + ":" + player.getPlayerInventory().get(i));
                    }
                    int itemDropNumber = sc.nextInt();
                    player.getCurrentRoom().addItem(player.getPlayerInventory().get(itemDropNumber));
                    player.getPlayerInventory().remove(itemDropNumber);
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
                default:
                    System.out.println("Invalid input, please try again");


            }

        }
    }
}