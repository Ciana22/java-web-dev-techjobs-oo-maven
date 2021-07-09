package com.company;

import java.util.Objects;

public class CoreCompetency extends JobField {
//    private static int nextId = 1;
//
//    private int id;
//    private String value;
//
//    public CoreCompetency() {
//        id = nextId;
//        nextId++;
//    }

    public CoreCompetency(String value) {
        super(value);
//        this();
//        this.value = value;
    }


    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return this.value;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return id == coreCompetency.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    public String getValue() {
//        return value;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but ONLY a getter for the 'id' field

}
