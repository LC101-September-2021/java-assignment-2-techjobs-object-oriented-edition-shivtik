package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job( String name, Employer employer,
                Location location, PositionType pt,
                CoreCompetency cc) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = pt;
        this.coreCompetency = cc;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String checkData(String data) {

        if (data.isEmpty()) {
            return "Data not available";
        } else {
            return data;
        }
    }

    public String toString() {
        String job;

        job = "\n ID: " + this.getId();
        job = job + "\n Name: " + checkData(this.getName());
        job = job + "\n Employer: " + checkData(this.getEmployer().getValue());
        job = job + "\n Location: " + checkData(this.getLocation().getValue());
        job = job + "\n Position Type: " + checkData(this.getPositionType().getValue());
        job = job + "\n Core Competency: " + checkData(this.getCoreCompetency().getValue());

        return job;

    }
}
