package Chapter8;

import java.util.ArrayList;

public class Banner {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Person persons[] = new Person[15_000];
        persons[0] = new Student("John Smith", "900000000", "123 street, city, state, zip, usa", "jsmith@samford.edu");
        persons[1] = new Faculty("Jane Doe", "900000001", "242 lane, city, state, zip, usa", "Jdoe@samford.edu");
        persons[2] = new Student("Katelyn Engel", "900000002", "464 drive, city, state, zip, usa", "kengel@samford.edu");
        persons[3] = new Faculty("Bob Brown", "900000003", "256 road, city, state, zip, usa", "bbrown@samford.edu");
        persons[4] = new Staff("Charlie Davis", "900000004", "333 street, city, state, zip, usa", "cdavis@samford.edu");
        for (Person person : persons){
            if (person!=null){
                System.out.println("Name: " + person.name);
                
                System.out.println("Nmae: "+ person.getName());
                System.out.println("Type: " + person.getType());

            }
        }
    }
}
