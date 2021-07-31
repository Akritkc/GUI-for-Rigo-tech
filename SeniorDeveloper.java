
/**
 * This is the sub-class of Developer class
 *
 * @author (Akrit K.C)
 * @version (24January,2019)
*/
public class SeniorDeveloper extends Developer
{
    double Salary;
    String JoiningDate;
    String StaffRoomNumber;
    int ContractPeriod;
    double AdvanceSalary;
    boolean Appointed;
    boolean Terminated;
    
    public SeniorDeveloper(String Platform, String interviewerName, int Workinghour, double Salary, int ContractPeriod){
        super(Platform, interviewerName, Workinghour);
        this.Salary = Salary;
        this.ContractPeriod = ContractPeriod;
        JoiningDate = "";
        StaffRoomNumber = "";
        AdvanceSalary = 0.0;  
        Appointed = false;
        Terminated = false;
    }
    
    public double getSalary(){
        return Salary;
    }
    
    public String getJoiningDate(){
        return JoiningDate;
    }
    
    public String getStaffRoomNumber(){
        return StaffRoomNumber;
    }
    
    public int getContractPeriod(){
        return ContractPeriod;
    }
    
    public double getAdvanceSalary(){
        return AdvanceSalary;
    }
    
    public boolean getAppointed(){
        return Appointed;
    }
    
    public boolean getTerminated(){
        return Terminated;
    }
    
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    
    public void setContract_Period(int ContractPeriod){
        this.ContractPeriod = ContractPeriod;
    }
    
    public void hire(String developerName, String JoiningDate, double AdvanceSalary, String StaffRoomNumber){
        if (getStaffRoomNumber() != StaffRoomNumber){
            setdeveloperName(developerName);
            this.JoiningDate = JoiningDate;
            this.AdvanceSalary = AdvanceSalary;
            this.StaffRoomNumber = StaffRoomNumber;
            Appointed = true;
            Terminated = false;            
        }else{
            System.out.println(getdeveloperName() + " Staff room number taken : "+ getStaffRoomNumber());
        }
    }
    
    public void Terminate(){
        if (getTerminated() == true){
            System.out.println("Developer terminated");
        }else{
            setdeveloperName("");
            JoiningDate = "";
            AdvanceSalary = 0.0;
            Appointed = false;
            Terminated = true;
        }
    }
    
    public void Display_Work(){
        System.out.println("Working Platform: " + getPlatform());
        System.out.println("Interviewer Name: " + getinterviewerName());
        System.out.println("Developer Salary: " + Salary);
    }
    
    public void Display_Personal(){
        Display();
        if (getAppointed() == true){
            System.out.println("Termination Status: " + getTerminated());
            System.out.println("Joining Date: " + getJoiningDate());
            System.out.println("Advance Salary: " + getAdvanceSalary());
        }
          
    }
       
}
    