
/**
 * This is a sub-class of class Developer
 *
 * @author (Akrit K.C)
 * @version (January24,2019)
 */
public class Juniordeveloper extends Developer
{
    double Salary;
    String AppointedDate;
    String EvaluationPeriod;
    String TerminationDate;
    String Specialization;
    String AppointedBy;
    boolean Joined;
    
    public Juniordeveloper(String Platform, String interviewerName, int Workinghour, double Salary, String AppointedBy, String TerminationDate){
        super(Platform, interviewerName, Workinghour);
        this.Salary = Salary;
        this.AppointedBy = AppointedBy;
        this.TerminationDate = TerminationDate;
        AppointedDate = "";
        EvaluationPeriod = "";
        Specialization = "";
        Joined = false;

    }
     public double getSalary(){
        return Salary;
    }
    
    public String getAppointedDate(){
        return AppointedDate;
    }
        
    public String getEvaluationPeriod(){
        return EvaluationPeriod;
    }
    
    public String getTerminationDate(){
        return TerminationDate;
    }
    
    public String getSpecialization(){
        return Specialization;
    }
    
    public String getAppointedBy(){
        return AppointedDate;
    }
    
    public boolean getJoined(){
        return Joined;
    }
    
    public void setSalary(double salary){
        if (getJoined() == false){
            this.Salary = Salary;
        }else{
            System.out.println(getdeveloperName() + " is hired");
        }    
    } 
    
    public void setEvaluation_Period(String Evaluation_Period){
        this.EvaluationPeriod = EvaluationPeriod;
    }
    
    public void Appoint_Platform(String developerName, String AppointedDate, String TerminationDate, String Specialization){
        if (getJoined() == false){
            setdeveloperName(developerName);
            Joined = true;
            this.AppointedDate = AppointedDate;
            this.TerminationDate = TerminationDate;
            this.Specialization = Specialization;
        }else{
            System.out.println(getdeveloperName() + " was appointed on " + getAppointedDate());
        }    
    }
    
    public void Display_Personal(){
        Display();
        if (getJoined() == true){
            System.out.println("Appointed Date: " + getAppointedDate());
            System.out.println("Evaluation Period: " + getEvaluationPeriod());
            System.out.println("Termination Date: " + getTerminationDate());
            System.out.println("Developer Salary: " + getSalary());
            System.out.println("Specialization : " + getSpecialization());
            System.out.println("Developer Appointed By: " + getAppointedBy());            
        }    
        
    }    
}

