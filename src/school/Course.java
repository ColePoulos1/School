package school;

import java.util.ArrayList;

public class Course {
    enum Type {
        Math, Science, English, History, Elective, PE, Language
    }
    public static final int numPeriods = 4;
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private Teacher theTeacher;
    private String name;
    private int period;
    private Type type;
    private boolean honors;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public static Course addCourse(String _name, Type _type, int _period, boolean _honors)
    {
        Course temp = new Course(_name,_type,_period,_honors);
        courses.add(temp);
        return(temp);
    }
    
    Course()
    {
        name = "Blank";
        period = 0;
        type = Type.Elective;
        honors = false;
    }
    Course(String _name, Type _type, int _period, boolean _honors)
    {
        name = _name;
        type = _type;
        period = _period;
        honors = _honors;
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    public void setType(Type _type)
    {
        type = _type;
    }
    public Type getType()
    {
        return(type);
    }
    public void setPeriod(int _period)
    {
        period = _period;
    }
    public int getPeriod()
    {
        return(period);
    }
    public void setHonors(boolean _honors)
    {
        honors = _honors;
    }
    public boolean getHonors()
    {
        return(honors);
    }
    public ArrayList getStudents()
    {
       return(students);
    }
    public String getTeacherName()
    {
        if(theTeacher !=null)
        return(theTeacher.getName());
        else
            return(" ");
    }
    
    public Teacher getTeacher()
    {
        return(theTeacher);
    }
    
    public boolean setTeacherOK(Teacher _teacher)
    {
        if (theTeacher == null)
        return(true);
        else
            return(false);
    }
    public boolean addTeacher(Teacher _teacher)
    {
        if(!_teacher.setCourseOK(this))
            return(false);
        if(!setTeacherOK(_teacher))
            return(false);
        else
        {
            addTeacherDoIt(_teacher);
            _teacher.addCourseDoIt(this);
            return(true);
        }  
    }
    public void addTeacherDoIt(Teacher _teacher)
    {
        theTeacher = _teacher;
    }
    
    public static void printCourseNames()
    {
        System.out.println("Names of all courses:");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void printCourseNames(Type _type)
    {
        System.out.println("Names of " + _type + " type courses:");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if(temp.getType() == _type)
                System.out.println(temp.getName());
            }
        }
    }
    
    public boolean setStudentOK(Student _student)
    {
        if(_student != null)
            return(true);
        else
            return(false);
    }
    
    public boolean addStudent(Student _student, double gradeScore)
    {
        if(!_student.setCourseOK(this))
            return(false);
        if(!setStudentOK(_student))
            return(false);
        else
        {
            addStudentDoIt(_student);
            _student.addCourseDoIt(this, gradeScore);
            return(true);
        }
        
    }
    public void addStudentDoIt(Student _student)
    {
        students.add(_student); 
    }
    
    public String toString()
    {
        return(name + ". " + type + " in period " + period + ".");
    }
}