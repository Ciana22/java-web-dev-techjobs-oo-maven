package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;

    public Job() {
        id = nextId;
        nextId++;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {


//        "Name: Product tester\n" +
//        "Employer: Acme\n" +
//        "Location: Desert\n" +
//        "Position Type: Quality Control\n" +
//        "Core Competency: Persistence\n";
        String nameDetail;
        String employerDetail;
        String locationDetail;
        String positionTypeDetail;
        String coreCompetencyDetail;

        if (name.equals("")) {
            nameDetail = "Data Not Available";
        } else {
            nameDetail = this.getName();
        }
        if (employer.toString().equals("")) {
            employerDetail = "Data Not Available";
        } else {
            employerDetail = this.employer.toString();
        }
        if (location.toString().equals("")) {
            locationDetail = "Data Not Available";
        } else {
            locationDetail = this.location.toString();
        }
        if (positionType.toString().equals("")) {
            positionTypeDetail = "Data Not Available";
        } else {
            positionTypeDetail = this.positionType.toString();
        }
        if (coreCompetency.toString().equals("")) {
            coreCompetencyDetail = "Data Not Available";
        } else coreCompetencyDetail = this.coreCompetency.toString();

        return "ID: " + id + "\nName: " + nameDetail + "\nEmployer: " + employerDetail + "\nLocation: " + locationDetail + "\nPosition Type: " + positionTypeDetail + "\nCore Competency: " + coreCompetencyDetail + "\n";
    }
    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.
}
