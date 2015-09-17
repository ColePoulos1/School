package school;
import java.util.ArrayList;
import java.util.Calendar;
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
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    public static Person addPerson(String _name, Gender _gender, int _weight, int _month, int _day, int _year)
    {
        Person temp = new Person(_name,_gender, _weight, _month, _day, _year);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name = "Blank";
        gender = Gender.Male;
        weight = 1;
    }
    Person(String _name, Gender _gender, int _weight, int _month, int _day, int _year)
    {
        name = _name;
        gender = _gender;
        weight = _weight;
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
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
    public void setBirthDate(int _month, int _day, int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int curday = now.get(Calendar.DAY_OF_MONTH);
        int curmonth = now.get(Calendar.MONTH) + 1;
        int curyear = now.get(Calendar.YEAR);
        int age = curyear - birthYear -1;
        if(curmonth >= birthMonth)
            if(curday >= birthDay)
                age++;
        return(age);
        
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
