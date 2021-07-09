package com.company;

public abstract class JobField {
    private static int nextId = 1;

    public int id;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }
        public int getId () { return this.id;}

        public String getValue () { return this.value;}

        public void setValue (String value){ this.value = value;}
    }

