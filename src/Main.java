import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();

        Employee john = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee george = new Employee("George", "Harrison", "Developer", 50000.00);
        Student ringo = new Student("Ringo", "Starr", 2.5);
        Student paul = new Student("Paul", "McCartney", 3.2);

        peopleList.add(john);
        peopleList.add(george);
        peopleList.add(ringo);
        peopleList.add(paul);

        Collections.sort(peopleList);

        printData(peopleList);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}