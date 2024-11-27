package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.InvalidRoomAssignmentException;

public interface PatientManagement {
    void addPatient(Patient patient);

    void removePatient(Patient patient);

    void assignRoom(Patient patient, Room room) throws InvalidRoomAssignmentException;

}