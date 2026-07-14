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

        int comparacion = Integer.compare(this.year, otraPersona.year);

        if (comparacion == 0) {
            comparacion = this.name.compareTo(otraPersona.name);
        }

        return comparacion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + year;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        if (year != other.year) {
            return false;
        }

        return name.equals(other.name);
    }
}