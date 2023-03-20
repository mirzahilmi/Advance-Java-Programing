package test;
public class Human {
    private int id;
    private String name;
    private int yearOfBirth;
    private String interest;

    Human(int max) {
        this.id = (int)(Math.random() * (max - 1)) + 1;
    }

    void breath() {
        System.out.printf("\tBernafas...");
    }

    void setName(String name) {
        this.name = name;
    }

    void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }

    void setInterest(String interest) {
        this.interest = interest;
    }

    String getName() {
        return this.name;
    }

    int getYearOfBirth() {
        return this.yearOfBirth;
    }

    int getID() {
        return this.id;
    }

    String getInterest() {
        return this.interest;
    }
}
