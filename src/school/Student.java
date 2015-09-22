/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 147003480
 */
public class Student extends Person {
    private int gradeLevel;
    
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
    
    public int getgradeLevel()
    {
        return(gradeLevel);
    }
    public void setgradeLevel(int _grade)
    {
        gradeLevel = _grade;
    }
}
