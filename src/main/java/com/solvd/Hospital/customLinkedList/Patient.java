package com.solvd.Hospital.customLinkedList;

public class Patient {
    private final int id;
    private final String name;
    private final String condition;


    public Patient(int id, String name, String condition) {
        this.id = id;
        this.name = name;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Patient{id=" + id + ", name='" + name + "', condition='" + condition + "'}";
    }
}
