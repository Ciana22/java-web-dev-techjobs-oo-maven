package com.company;

import java.util.Objects;

public class PositionType extends JobField {
//    private static int nextId = 1;
//
//    private int id;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

    public PositionType(String value) {
        super(value);
//        this();
//        this.value = value;
    }
//
//    @Override
//    public String toString() {return this.value;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
        return id == positionType.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when their id fields match.

    // Getters and Setters:
//
//    public int getId() { return this.id; };
//
//    public String getValue() { return this.value; }
//
//    public void setValue(String value) { this.value = value; }
//}
