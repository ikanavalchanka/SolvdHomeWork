package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.InvalidRoomAssignmentException;

enum RoomType {
    GENERAL, ICU, EMERGENCY, OPERATING
}

class Room {
    private final RoomType roomType;
    private final int roomNumber;

    public Room(RoomType roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ")";
    }


    public void assignRoom(Patient patient) throws InvalidRoomAssignmentException {
        if (this.roomType == RoomType.ICU && !patient.getIllness().equals("Critical")) {
            throw new InvalidRoomAssignmentException("Room " + this.roomNumber + " cannot be assigned to patient with illness: " + patient.getIllness());
        }
        System.out.println("Room " + this.roomNumber + " assigned successfully to patient " + patient.getName() + " with illness: " + patient.getIllness());
        patient.setRoom(this);
    }
}
