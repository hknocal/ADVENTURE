import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    Map map = new Map ();

    private ArrayList<Item> playerInventory = new ArrayList<>();

    private Room currentRoom = map.getStarterRoom();

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom (Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String look() {
        return currentRoom.toString();
    }

    public boolean goWest(){
        Room roomWest = getCurrentRoom().getWest();
        if (roomWest == null) {
            return false;
        }
        else {
            setCurrentRoom(roomWest);
            return true;
        }
    }
    public boolean goNorth() {
        Room roomNorth = getCurrentRoom().getNorth();
        if (roomNorth == null){
            return false;
        }
        else {
            setCurrentRoom(roomNorth);
            return true;
        }

    }

    public boolean goSouth(){
        Room roomSouth = getCurrentRoom().getSouth();
        if (roomSouth == null) {
            return false;
        }
        else {
            setCurrentRoom((roomSouth));
            return true;
        }

    }

    public boolean goEast() {
        Room roomEast = getCurrentRoom().getEast();
        if (roomEast == null) {
            return false;
        } else {
            setCurrentRoom(roomEast);
            return true;
        }
    }

    public ArrayList<Item> getPlayerInventory() {
        return playerInventory;
    }

    public void addItem (Item item) {
        playerInventory.add(item);
    }

    /*
    public void takeItem(Room room){
        room.getItems();
        System.out.println(room.getItems());
    }
*/
    /*
    addToDatabase(superheroName, superheroHeight, superheroPower, superheroWeakness, superheroHumanOrNot);
        System.out.println("You have added: " + "" + superheroName + " " + "To the database");
        System.out.println("");
     */


    public void takeItem(){
        for (int i = 0; i < currentRoom.getItems().size(); i++) {
            System.out.println(i + ":" + currentRoom.getItems().get(i));
            currentRoom.getItems().remove(-1);
        }
    }


}
