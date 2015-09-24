
package school;

public class Student extends Person {
    private int gradeLevel;
    private Course theCourse;
    
    public static Student addStudent(String _name, Gender _gender, int _weight, int _month, int _day, int _year, int _gradeLevel)
    {
        Student temp = new Student(_name,_gender, _weight, _month, _day, _year, _gradeLevel);
        addPerson(temp);
        return(temp);
    }
    
    Student(String _name, Gender _gender, int _weight, int _month, int _day, int _year, int _gradeLevel)
    {
        super(_name, _gender, _weight, _month, _day, _year);
        gradeLevel = _gradeLevel;
    }
    
    public int getGradeLevel()
    {
        return(gradeLevel);
    }
    public void setGradeLevel(int _grade)
    {
        gradeLevel = _grade;
    }
    public String getCourseName()
    {
        return(theCourse.getName());
    }
        
    public void addCourse(Course _course)
    {
        if(theCourse == null)
        {
            theCourse = _course;
            _course.addStudent(this);
        }
    }
    public static void printNames()
    {
        System.out.println("Names of all Students:");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
    }
}
