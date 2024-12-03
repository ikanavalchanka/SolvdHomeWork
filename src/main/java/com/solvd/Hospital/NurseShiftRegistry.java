package com.solvd.Hospital;

import java.util.HashMap;
import java.util.Map;

class NurseShiftRegistry {
    private Map<String, String> nurseShifts = new HashMap<>();
    public void addShift(String nurseName, String shiftTime) {
        if (nurseShifts.containsKey(nurseName)) {
            System.out.println("Error: " + nurseName + " already has a shift.");
        } else {
            nurseShifts.put(nurseName, shiftTime);
            System.out.println(nurseName + " has been assigned to " + shiftTime + " shift.");
        }
    }

    public String getShift(String nurseName) {
        return nurseShifts.getOrDefault(nurseName, "No shift assigned");
    }

    public void endShift(String nurseName) {
        if (nurseShifts.containsKey(nurseName)) {
            nurseShifts.remove(nurseName);
            System.out.println(nurseName + " has ended the shift.");
        } else {
            System.out.println("Error: No shift found for " + nurseName);
        }
    }
}