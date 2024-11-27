package com.solvd.Hospital;

import com.solvd.Hospital.exceptions.EquipmentNotFoundException;

interface EquipmentManagement {
    void addEquipment(String equipment);

    void removeEquipment(String equipment) throws EquipmentNotFoundException;

    String getEquipmentStatus();
}