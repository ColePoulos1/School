package school;
import java.util.ArrayList;
public class Person {
    enum Gender {
        Male,Female
    }
    private static int currentPeopleIndex = 0;
    private Course theCourse;
    private static ArrayList<Person> people = new ArrayList<Person>();
    private String name;
    private Gender gender;
    private int weight;
    public static Person addPerson(String _name, Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender, _weight);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name = "Blank";
        gender = Gender.Male;
        weight = 1;
    }
    Person(String _name, Gender _gender, int _weight)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
    }
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public int getWeight()
    {
        return(weight);
    }
    public static void printNames()
    {
        System.out.println("All names:");
        for (Person temp : people)
        {
            if (temp != null)
            {
                System.out.println(temp.getName());
            }
        }
    }
    public static void printNames(Gender _gender)
    {
        System.out.println("Names of " + _gender + " people:");
        for (Person temp : people)
        {
            if (temp != null)
            {
                if(temp.getGender() == _gender)
                System.out.println(temp.getName());
            }
        }
    }
    public static void printWeights()
    {
        System.out.println("All peoples' weights:");
        for (Person temp : people)
        {
            if (temp != null)
            {
                System.out.println(temp.getName() + " is " + temp.getWeight() + " pounds");
            }
        }
    }
    
    public void addCourse(Course _course)
    {
        if(_course == null)
        {
            theCourse = _course;
            _course.addPerson(this);
        }
    }
    
    public String toString()
    {
        return(name + ". " + gender + " and " + weight + " pounds.");
    }
}
