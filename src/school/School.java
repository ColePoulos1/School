package school;

public class School {

    public static void main(String[] args) {
        
        Student joe =  Student.addStudent("Joe",Person.Gender.Male,165,2,21,1990,10);
        Student jill =  Student.addStudent("Jill",Person.Gender.Female,105,2,21,1990,9);
        Student bobby =  Student.addStudent("Bobby",Person.Gender.Male,168,2,21,1990,11);        
        Student ann =  Student.addStudent("Annie",Person.Gender.Female,98,2,21,1990,12);        
        Student sean =  Student.addStudent("Sean",Person.Gender.Male,138,2,21,1990,11);        
                
        Teacher price = Teacher.addTeacher("Price", Person.Gender.Male, 206,2,21,1990,4.7);
        Teacher hudson = Teacher.addTeacher("Hudson", Person.Gender.Female, 106,2,21,1990,7.2);
        Teacher anderson = Teacher.addTeacher("Anderson", Person.Gender.Female, 112,2,21,1990,3.2);
        Teacher smith = Teacher.addTeacher("Smith", Person.Gender.Male, 152,2,21,1990,8.2);
        
        Course geom =  Course.addCourse("Geometry", Course.Type.Math, 1, false);
        Course photo =  Course.addCourse("Photography", Course.Type.Elective, 3, false);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2, false);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2, true);       
        Course chemistry =  Course.addCourse("Chemistry", Course.Type.Science, 3, true);       
        Course dance =  Course.addCourse("Dance", Course.Type.Elective, 1, false);       

        geom.addStudent(bobby,3.5);
        photo.addStudent(bobby,3.0);
        biology.addStudent(bobby,4.0);
        
        geom.addStudent(jill,2.8);
        jill.addCourse(chemistry, 3.4);
        
        worldHistory.addStudent(ann,4.0);
        ann.addCourse(photo, 3.7);
        ann.addCourse(worldHistory, 3.3);
        
        worldHistory.addStudent(sean,3.6);
        chemistry.addStudent(sean,3.1);
        dance.addStudent(sean,2.4);
         
        geom.addTeacher(price);
        photo.addTeacher(anderson);
        dance.addTeacher(price);
        biology.addTeacher(smith);
        smith.addCourse(chemistry);
        worldHistory.addTeacher(hudson);
        
        Student.printNames();
                  System.out.println(" ");
        Teacher.printNames();
                  System.out.println(" ");
        Course.printCourseNames();
                   System.out.println(" ");
        smith.printStudentNames(11);
                   System.out.println(" ");
        System.out.println(Student.getHighestGPA().getName() + " has the highest GPA.");
                   System.out.println(" ");
        System.out.println(Teacher.getMostElectives());
                   System.out.println(" ");
        Student.printHonorsStudents();
        
        
        
        
        
    }
}