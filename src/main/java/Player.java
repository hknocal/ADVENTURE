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

    public void attack(Enemy enemy) {
        if (weaponEquipped == null);
            else {
            System.out.println("You don't have a weapon equipped");
        }
        enemy.addToHealth(this.weaponEquipped.getWeaponDamage());
    }

}
