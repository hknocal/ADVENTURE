//TODO move take item & drop item to player class

import java.util.ArrayList;

public class Player {
    Map map = new Map();

    private ArrayList<Item> playerInventory = new ArrayList<>();

    private Room currentRoom = map.getStarterRoom();

    private int playerHealthPoints = 100;

    private Weapon weaponEquipped;

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String look() {
        return currentRoom.toString();
    }

    public boolean goWest() {
        Room roomWest = getCurrentRoom().getWest();
        if (roomWest == null) {
            return false;
        } else {
            setCurrentRoom(roomWest);
            return true;
        }
    }

    public boolean goNorth() {
        Room roomNorth = getCurrentRoom().getNorth();
        if (roomNorth == null) {
            return false;
        } else {
            setCurrentRoom(roomNorth);
            return true;
        }

    }

    public boolean goSouth() {
        Room roomSouth = getCurrentRoom().getSouth();
        if (roomSouth == null) {
            return false;
        } else {
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

    public void addItem(Item item) {
        playerInventory.add(item);
    }

    public ArrayList<Item> inventoryShow() {
        return playerInventory;
    }

    public void playerHealth() {
        System.out.println("Current health status: " + playerHealthPoints);
    }

    public void eat(String foodName) {
        for (Item item : playerInventory) {
            if (item instanceof Food) {
                if (foodName.equals(item.getName())) {
                    System.out.println(playerInventory);
                    Food selectedFood = (Food) item;
                    playerHealthPoints += selectedFood.getHealthValue();
                    playerInventory.remove(item);
                    break;
                }

            }
        }
    }

    public boolean weaponEquip(String weaponName) {
        for (Item item : playerInventory) {
            if (item instanceof Weapon) {
                if (item.getName().equals(weaponName)) {
                    getPlayerInventory();
                    Weapon selectedWeapon = (Weapon) item;
                    weaponEquipped = selectedWeapon;
                    playerInventory.remove(selectedWeapon);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean move(String direction) {
        Room requestedRoom = null;

        if (direction.charAt(0) == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = currentRoom.getSouth();
        } else if (direction.charAt(0) == 'w') {
            requestedRoom = currentRoom.getWest();
        }

        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } else {
            return false;
        }
    }

}
