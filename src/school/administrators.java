
package school;

/**
 * @author Ahmad Alalwi
 */
public class administrators {
    
   //.......................Variables...........................................
    private int salary;//the Integer salary for administrator
    private jobsType job_type;//this's type of job for administrator
    private Teacher teacher ;//object from class Teacher
    
    
    //.....................constractors.........................................
    public administrators(Teacher _teacher, jobsType _jobType,int _salary){
        // Initialize Variables
        this.salary= _salary;
        this.job_type = _jobType;
        this.teacher =_teacher;        
    }
    
    //,...................Set and Get Methods...................................
    public jobsType getJob_type() {
        return job_type;
    }

    public void setJob_type(jobsType job_type) {
        this.job_type = job_type;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //...................other Functions........................................
    @Override 
    public String toString()//rewrite the toString Method for the administrators 
    {
        return getTeacher().toString()
                +" "+"Salary is : "+"$"+this.getSalary()+" job is : "+this.getJob_type();
    }
}

    //...................enumeration............................................
/**
 * this's jobs is constantes in any school
 * princapal
 * assisten principal
 * counselor
 */
enum jobsType{
    PRINCIPAL,//School princapal
    ASSISTNT_PRINCIPAL,//the assisten for princapal
    COUNSELOR;//School counselor
    }
