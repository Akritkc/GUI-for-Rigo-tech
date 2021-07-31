
/**
 * This the main class of the project.
 *
 * @author (Akrit K.C)
 * @version (January24,2019)
 */
public class Developer
{
    private String Platform;
    private String interviewerName;
    private String developerName;
    private int Workinghour;

    /**
     * Constructor for objects of class Developer
     */
    public Developer(String Platform, String interviewerName, int Workinghour)
    { 
        this.Platform = Platform;
        this.interviewerName = interviewerName;
        this.Workinghour = Workinghour;
        developerName = "";
        
    }

      public String getPlatform(){
        return Platform;
    }
    
    public String getinterviewerName(){
        return interviewerName;
    }
    
    public String getdeveloperName(){
        return developerName;
    }
    
    public int getWorkinghour(){
        return Workinghour;
    }
    
    public void setdeveloperName(String developername){
        this.developerName = developerName;
    }
    
    public void Display(){
        System.out.println("Working Platform: " + Platform);
        System.out.println("Working Hour: " + Workinghour);
        System.out.println("Interviewer Name: " + interviewerName);
        if (developerName != ""){
            System.out.println("Developer Name: " + developerName);
        }
    
    }
    
    
}
