package school;

public class School {

    public static void main(String[] args) {
        
        Course algebra1 = Course.addCourse("Algebra 1", Course.Type.Math, 3);
        Course geometry = Course.addCourse("Geometry", Course.Type.Math, 1);
        Course apeuro = Course.addCourse("AP Euro", Course.Type.History, 4);
        Course compsci1 = Course.addCourse("CompSci 1", Course.Type.Elective, 2);
        Course weights1 = Course.addCourse("Weights 1", Course.Type.PE, 3);
        Course worldhist1 = Course.addCourse("World History 1", Course.Type.History, 2);
        Person joe = Person.addPerson("Joe", Person.Gender.Male, 235, 2,2,2002);
        Person jill = Person.addPerson("Jill", Person.Gender.Female, 190, 1,13,2000);
        Person jack = Person.addPerson("Jack", Person.Gender.Male, 82, 1,21,2002);
        Person joanne = Person.addPerson("Joanne", Person.Gender.Female, 132, 3,3,2004);
        Person john = Person.addPerson("John", Person.Gender.Male, 356, 9,23,2001);

        System.out.println(joanne);
        System.out.println(" ");
        Person.printNames(Person.Gender.Male);
        System.out.println(" ");
        Person.printWeights();
        System.out.println(" ");
        System.out.println(algebra1);
        System.out.println(" ");
        Course.printNames();
        System.out.println(" ");
        Course.printNames(Course.Type.Math);
        System.out.println(" ");
        System.out.println(jill.getAge());
        System.out.println(" ");
        
        Student craig = Student.addStudent("Craig",Person.Gender.Male,168,2,4,25,11);
       // Student bobby = new Student("Bobby",Person.Gender.Male,168,2,4,25,11);
        System.out.println(craig.getName());
    }
}