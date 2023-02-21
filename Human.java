class Human {
    private String name;
    private int yearOfBirth;

    void breath() {
        System.out.printf("\tBernafas...");
    }

    void setName(String name) {
        this.name = name;
    }

    void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }

    String getName() {
        return this.name;
    }

    int getYearOfBirth() {
        return this.yearOfBirth;
    }
}
