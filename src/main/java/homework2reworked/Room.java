package homework2reworked;

class Room {
    private String roomNumber;
    private boolean isOccupied;
    private String roomType;

    public Room(String roomNumber, boolean isOccupied, String roomType) {
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Occupied: " + isOccupied + ", Type: " + roomType;
    }
}
