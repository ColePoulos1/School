
package school;

import java.util.ArrayList;

public class Teacher extends Person {
    private int gradeLevel;
    private double meanLevel;
    private Course courses[] = new Course[Course.numPeriods];
    
    public static Teacher addTeacher(String _name, Gender _gender, int _weight,
                                     int _month, int _day, int _year, double _meanLevel)
    {
        Teacher temp = new Teacher(_name,_gender, _weight, _month, _day, _year, _meanLevel);
        addPerson(temp);
        return(temp);
    }
    
    Teacher(String _name, Gender _gender, int _weight, int _month, int _day,
            int _year, double _meanLevel)
    {
        super(_name, _gender, _weight, _month, _day, _year);

        meanLevel = _meanLevel;
        if(meanLevel < 0.0)
            meanLevel = 0;
        if(meanLevel > 2.0)
            meanLevel = 2;
    }
    
    public int getGradeLevel()
    {
        return(gradeLevel);
    }
    public void setGradeLevel(int _grade)
    {
        gradeLevel = _grade;
    }
    public double getMeanLevel()
    {
        return(meanLevel);
    }
    public void setMeanLevel(double _meanLevel)
    {
        meanLevel = _meanLevel;
    }
    public String getName()
    {
        return(super.getName());
    }
    public String getCourseName(int _period)
    {
        return(courses[_period-1].getName());
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
    public boolean addCourse(Course _course)
    {
        if(!setCourseOK(_course))
            return(false);
        if(!_course.setTeacherOK(this))
            return(false);
        else
        {
            addCourseDoIt(_course);
            _course.addTeacherDoIt(this);
            return(true);
        } 
    }

    public void addCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()-1] = _course;
    }
    public static void printNames()
    {
        System.out.println("Names of all Teachers:");
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
                System.out.println(temp.getName());
        }
    }
    public void printStudentNames()
    {
        System.out.println("Names of " + super.getName() + "'s Students:");
        for(int index = 0; index < Course.numPeriods; index++)
        {
            if (courses[index] != null)
            {
                ArrayList<Student> stud = courses[index].getStudents();
                for(Student temp : stud)
                {
                    System.out.println(temp.getName());
                }
            }
        }
    }
    
    public void printStudentNames(int _gradeLevel)
    {
        System.out.println("Names of " + super.getName() + "'s Students:");
        for(int index = 0; index < Course.numPeriods; index++)
        {
            if (courses[index] != null)
            {
                ArrayList<Student> stud = courses[index].getStudents();
                for(Student temp : stud)
                {
                    if(temp.getGradeLevel() == _gradeLevel)
                    System.out.println(temp.getName());
                }
            }
        }
    }
    
    public static void printThatTeachesGradeLevel(int _gradeLevel)
    {
        System.out.println("Teachers That Teach " + _gradeLevel + "th Graders: ");
        for(Person temp : people)
        {
            if (temp instanceof Teacher)
            {
                for(int index = 0; index < Course.numPeriods; index++)
                {
                    if (((Teacher)temp).courses[index] != null)
                    {
                        ArrayList<Student> stud = ((Teacher)temp).courses[index].getStudents();
                        for(Student tempoo : stud)
                        {
                            if(tempoo.getGradeLevel() == _gradeLevel)
                                System.out.println(temp.getName());
                                index = Course.numPeriods;
                        }
                    }
                }
            }
        }
    }
    
    public static Teacher getMostElectives()
    {
        Teacher curMMM = null;
        double cm = 0;
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
            {
                double counter = 0;
                for(int index = 0; index < Course.numPeriods; index++)
                {
                    if(((Teacher)temp).courses[index] != null)
                    {
                        if(((Teacher)temp).courses[index].getType() == Course.Type.Elective)
                            counter++;
                    }
                }
                if(counter >= cm)
                {
                    curMMM = (Teacher)temp;
                    cm = counter;
                }
            }
        }
        return(curMMM);
    }
}
