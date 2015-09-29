package school;

public class School {

    public static void main(String[] args) {
        
        Course algebra1 = Course.addCourse("Algebra 1", Course.Type.Math, 3);
        Course geometry = Course.addCourse("Geometry", Course.Type.Math, 1);
        Course apeuro = Course.addCourse("AP Euro", Course.Type.History, 4);
        Course compsci1 = Course.addCourse("CompSci 1", Course.Type.Elective, 2);
        Course weights1 = Course.addCourse("Weights 1", Course.Type.PE, 3);
        Course worldhist1 = Course.addCourse("World History 1", Course.Type.History, 2);
        Student joe = Student.addStudent("Joe", Person.Gender.Male, 235, 2,2,2002, 10);
        Student jill = Student.addStudent("Jill", Person.Gender.Female, 190, 1,13,2000, 9);
        Student jack = Student.addStudent("Jack", Person.Gender.Male, 82, 1,21,2002, 12);
        Student joanne = Student.addStudent("Joanne", Person.Gender.Female, 132, 3,3,2004,11);
        Student john = Student.addStudent("John", Person.Gender.Male, 356, 9,23,2001, 9);
        Student craig = Student.addStudent("Craig",Person.Gender.Male,168,2,9,1995,11);
        Teacher jameson = Teacher.addTeacher("Mr. Jameson",Person.Gender.Male,183,2,4,1925,11, 1.7);
        Teacher johnson = Teacher.addTeacher("Mrs. Johnson",Person.Gender.Female,131,5,2,1975,9, 0.3);
        Teacher jeronne = Teacher.addTeacher("Mr. Jerrone",Person.Gender.Male,264,10,7,1949,11, 1.0);
        Teacher joushlef = Teacher.addTeacher("Mrs. Joushlef",Person.Gender.Female,145,11,6,1977,9, 0.4);
        Teacher jackson = Teacher.addTeacher("Mr. Jackson",Person.Gender.Male,523,6,5,1950,11, 0.1);
        Teacher jeaneclaude = Teacher.addTeacher("Mrs. JeaneClaude",Person.Gender.Female,182,5,2,1964,9, 1.9);
        weights1.addStudent(joe, 3.0);
        algebra1.addStudent(jill, 0.5);
        worldhist1.addStudent(john, 1.7);
        compsci1.addStudent(jack, 2.7);
        geometry.addStudent(jack, 4.0);
        geometry.addStudent(joanne, 3.5);
        geometry.addTeacher(joushlef);
        weights1.addTeacher(jackson);
        worldhist1.addTeacher(jameson);
        compsci1.addTeacher(jeaneclaude);
        apeuro.addTeacher(jeronne);
        geometry.addTeacher(johnson);
        
        System.out.println(joushlef);
        System.out.println(" ");
        Person.printNames(Person.Gender.Male);
        System.out.println(" ");
        Person.printWeights();
        System.out.println(" ");
        System.out.println(algebra1);
        System.out.println(" ");
        System.out.println(jill.getAge());
        System.out.println(" ");
        Student.printNames();
        System.out.println(" ");
        Teacher.printNames();
        System.out.println(" ");
        joe.printTeachersNames();
        System.out.println(" ");
        System.out.println(jack.getGPA());
        
        
        
    }
}