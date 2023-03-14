
public class Main {
    public static void main(String[] args) {
        Human person = new Human(100);
        person.setName("Benedict");
        person.setYearOfBirth(1995);
        person.setInterest("Data Engineering, Backend Development, Game Development");

        System.out.printf("\nID: %d\nName: %s\nYear of Birth: %d\nInterest: %s",
        person.getID(), person.getName(), person.getYearOfBirth(), person.getInterest());
    }
}
