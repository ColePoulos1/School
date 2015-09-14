package school;

import java.util.ArrayList;

public class Course {
    enum Type {
        Math, Science, English, History, Elective, PE, Language
    }
    private static ArrayList<Course> courses = new ArrayList<Course>();
    private String name;
    private int period;
    private Type type;
    
    public static Course addCourse(String _name, Type _type, int _period)
    {
        Course temp = new Course(_name,_type,_period);
        courses.add(temp);
        return(temp);
    }
    
    Course()
    {
        name = "Blank";
        period = 0;
        type = Type.Elective;
    }
    Course(String _name, Type _type, int _period)
    {
        name = _name;
        type = _type;
        period = _period;
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
    
    public static void printNames()
    {
        System.out.println("All courses:");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void printNames(Type _type)
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
    
    public String toString()
    {
        return(name + ". " + type + " in period " + period + ".");
    }
}
