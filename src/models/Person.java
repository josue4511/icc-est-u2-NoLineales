package models;

public class Person implements Comparable<Person> {
    private String name;
    private int year;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Person otraPersona) {
        return Integer.compare(this.year, otraPersona.getYear());

    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", year=" + year + '}';
    }
}