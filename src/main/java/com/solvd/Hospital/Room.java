package com.solvd.Hospital;


enum RoomType {
    GENERAL, ICU, EMERGENCY, OPERATING
}
class Room {
    private RoomType roomType;
    private int roomNumber;

    public Room(RoomType roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ")";
    }
}
