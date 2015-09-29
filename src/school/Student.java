
package school;

import java.util.ArrayList;

public class Student extends Person {
    private int gradeLevel;
    private Course courses[] = new Course[Course.numPeriods];
    private double gradeScores[] = new double[Course.numPeriods];
    
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
    public String getCourseName(int _period)
    {
        return(courses[_period-1].getName());
    }
    
    public double getGPA()
    {
        int numvalid = 0;
        double gpa = 0;
        for(int index = 0; index < Course.numPeriods; index++)
        {
            if(courses[index] != null)
            {    numvalid++;
                gpa += gradeScores[index];
            }
        }
        gpa /= numvalid;
        return(gpa);
    }
    
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);
        if (courses[_course.getPeriod()-1] != null)
            return(false);
        else
            return(true);
    }
    public boolean addCourse(Course _course, double _gradeScore)
    {
        if(!setCourseOK(_course))
            return(false);
        if(!_course.setStudentOK(this))
            return(false);
        else
        {
            addCourseDoIt(_course, _gradeScore);
            _course.addStudentDoIt(this);
            return(true);
        } 
    }

    public void addCourseDoIt(Course _course, double _gradeScore)
    {
        courses[_course.getPeriod()-1] = _course;
        gradeScores[_course.getPeriod()-1]= _gradeScore;
    }
    
    public void printTeachersNames()
    {
        System.out.println("Names of all Teachers for " + this.getName() + ":");
        
        for (int index = 0; courses.length > index; index++)
        {
            if(courses[index] == null)
            {
                
            }
            else if(courses[index].getTeacherName() == null)
            {
                
            }
            else
                System.out.println(courses[index].getTeacherName());
        }
    }
    
    public static void printNames()
    {
        System.out.println("Names of all Students:");
        for (Person temp : people)
        {
            if (temp instanceof Student && temp !=null)
                System.out.println(temp.getName());
        }
    }
}
