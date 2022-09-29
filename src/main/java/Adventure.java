public class Adventure {

    private Map map = new Map();
    public String help() {
        return """
                
                List op options to use:
                
                Typing "Look" and pressing enter --> Your character looks around the current room the person is in, highlighting usable object.
                Typing "Exit" and pressing enter --> Closes the program. Your progress wont be saved!
                Typing North and pressing enter --> Checks to see if you can move north. Informing the player if its doable.
                Typing East and pressing enter --> Checks to see if you can move East. Informing the player if its doable.
                Typing West and pressing enter --> Checks to see if you can move West. Informing the player if its doable.
                Typing South and pressing enter --> Checks to see if you can move south. Informing the player if its doable.
   
                """;
    }

    public String look() {
        return map.getCurrentRoom().toString();
    }

    public boolean goNorth() {
        Room roomNorth = map.getCurrentRoom().getNorth();
        if (roomNorth == null){
            return false;
        }
        else {
            map.setCurrentRoom(roomNorth);
            return true;
        }

    }

    public boolean goSouth(){
        Room roomSouth = map.getCurrentRoom().getSouth();
        if (roomSouth == null) {
            return false;
        }
        else {
            map.setCurrentRoom((roomSouth));
            return true;
        }

    }

    public boolean goWest(){
        Room roomWest = map.getCurrentRoom().getWest();
        if (roomWest == null) {
            return false;
        }
        else {
            map.setCurrentRoom(roomWest);
            return true;
        }
    }

    public boolean goEast(){
        Room roomEast = map.getCurrentRoom().getEast();
        if (roomEast == null) {
            return false;
        }
        else {
            map.setCurrentRoom(roomEast);
            return true;
        }
    }
}