
package school;

public class School {

    public static void main(String[] args) {
        
        
        Person joe = Person.addPerson("Joe", Person.Gender.Male, 235);
        Person jill = Person.addPerson("Jill", Person.Gender.Female, 190);
        Person jack = Person.addPerson("Jack", Person.Gender.Male, 82);
        Person joanne = Person.addPerson("Joanne", Person.Gender.Female, 132);
        Person john = Person.addPerson("John", Person.Gender.Male, 356);
        
        System.out.println(joanne);
        Person.printNames(Person.Gender.Male);
        Person.printWeights();
    }
}
