 
/**
 * This is the gui for RigoTechnology
 *
 * @author Akrit K.C
 * @version 3/4/2019
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.ArrayList;




public class RigoTech extends JFrame implements ActionListener
{
    private JPanel panelOne, panelTwo, panelThree, panelOneA, panelOneB;
    private JLabel platform,interviewerName, salary, workingHour, developersName, joiningDate, advanceSalary, developerNo, developersName1, specialization, appointedDate, terminationDate, developerNo1, contractPeriod, appointer, evaluationPeriod, messageOneMsg, staffRoomNumber;
    private JTextField platformText, interviewerNameText, salaryText, workingHourText, developersNameText, joiningDateText,advanceSalaryText,developerNoText, developerName1Text, specializationText, appointedDateText, terminationDateText, developerNo1Text,contractPeriodText,appointerText,evaluationPeriodText, staffRoomNumberText;
    private JButton panelOneAddJunior,panelOneAddSenior, panelTwoAppoint,panelThreeAppoint, panelThreeTerminate, display, clear;
    private TitledBorder panelOneTitle, panelTwoTitle, panelThreeTitle ;
    private Border etchedBorder;
    private JFrame messageOne;
    
    ArrayList<Developer> list = new ArrayList<Developer>();
    
    
    public RigoTech() 
    {
        super("Rigo Technology");
        this.setSize(500,700); 
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500,50);
        
        //Title for borders
        panelOneTitle = BorderFactory.createTitledBorder("Candidates");
        panelOneTitle.setTitleJustification(TitledBorder.CENTER);
        
        panelTwoTitle = BorderFactory.createTitledBorder("Junior Developers");
        panelTwoTitle.setTitleJustification(TitledBorder.CENTER);
        
        panelThreeTitle = BorderFactory.createTitledBorder("Senior Developers");
        panelThreeTitle.setTitleJustification(TitledBorder.CENTER);
        
        etchedBorder = BorderFactory.createEtchedBorder();
        
        
          
        //PanelOne
        panelOne = new JPanel();
       
        panelOne.setBounds(25, 25, 450, 202);
        panelOne.setBorder(panelOneTitle);
        panelOne.setLayout(null);
        this.add(panelOne);
        
        //PanelOne A
        panelOneA = new JPanel();
        
        panelOneA.setBounds(2,125,223,78);
        panelOneA.setBorder(etchedBorder);
        panelOneA.setLayout(null);
        panelOne.add(panelOneA);
        
        //Adding Lables in Panel One A
        
        appointer = new JLabel("Appointed By:");
        appointer.setBounds (10,5,150,30);
        panelOneA.add(appointer);
        
        //Adding Text field in Panel One A
        
        appointerText = new JTextField();
        appointerText.setBounds(100,5,110,30);
        panelOneA.add(appointerText);
        
        
        
        //PanelOne B
        panelOneB = new JPanel();
        
        panelOneB.setBounds(223,125,225,78);
        panelOneB.setBorder(etchedBorder);
        panelOneB.setLayout(null);
        panelOne.add(panelOneB);

        //Adding label for Panel One B
        
        contractPeriod = new JLabel("Contract Period:");
        contractPeriod.setBounds(10,5,180,30);
        panelOneB.add(contractPeriod);
        
        //Adding text field for Panel One B
        contractPeriodText = new JTextField();
        contractPeriodText.setBounds(110,5,96,30);
        panelOneB.add(contractPeriodText);
        

        //Labels for PanelOne
        platform = new JLabel("Platform :");
        platform.setBounds(10,20,100,30);
        panelOne.add(platform);

        interviewerName = new JLabel("Interviewer Name :");
        interviewerName.setBounds(10,55,150,30);
        panelOne.add(interviewerName);

        workingHour = new JLabel("WorkingHours:");
        workingHour.setBounds(10,90,150,30);
        panelOne.add(workingHour);
        
        salary = new JLabel("Salary:");
        salary.setBounds(230,90,150,30);
        panelOne.add(salary);

        //Text field for Panel One

        platformText = new JTextField();
        platformText.setBounds(150,20,280,30);
        panelOne.add(platformText);

        interviewerNameText = new JTextField();
        interviewerNameText.setBounds(150,55,280,30);
        panelOne.add(interviewerNameText);

        workingHourText = new JTextField();
        workingHourText.setBounds(110,90,100,30);
        panelOne.add(workingHourText);

        salaryText = new JTextField();
        salaryText.setBounds(280,90,150,30);
        panelOne.add(salaryText);
        
        //Panel One add buttons

        panelOneAddJunior = new JButton("Add Junior");
        panelOneAddJunior.setBounds(110, 40,100,30);
        panelOneA.add(panelOneAddJunior);
        panelOneAddJunior.addActionListener(this);
        
        panelOneAddSenior = new JButton("Add Senior");
        panelOneAddSenior.setBounds(110, 40, 100, 30);
        panelOneB.add(panelOneAddSenior);
        panelOneAddSenior.addActionListener(this);
       
        
       
        //Panel Two
        panelTwo = new JPanel();
        panelTwo.setBounds(25, 240, 450, 200);
        panelTwo.setBorder(panelTwoTitle);
        panelTwo.setLayout(null);
        this.add(panelTwo);
        
        //Labels for Panel Two  
        developersName1 = new JLabel("Developer's Name:");
        developersName1.setBounds(10,20,150,30);
        panelTwo.add(developersName1);
        
        specialization = new JLabel("Specialization:");
        specialization.setBounds(10,55,150,30);
        panelTwo.add(specialization);
        
        appointedDate = new JLabel("Appointed Date:");
        appointedDate.setBounds(10,90,150,30);
        panelTwo.add(appointedDate);
        
        terminationDate = new JLabel("Termination Date:");
        terminationDate.setBounds(230,90,150,30);
        panelTwo.add(terminationDate);
        
       
        evaluationPeriod = new JLabel("Evaluation Period:");
        evaluationPeriod.setBounds(10,125,180,30);
        panelTwo.add(evaluationPeriod);
        
       
        developerNo1 = new JLabel("Developer's Number:");
        developerNo1.setBounds(230,125,150,30);
        panelTwo.add(developerNo1);
        
        //Text field for Panel Two
      
        developersNameText = new JTextField();
        developersNameText.setBounds(150,20,280,30);
        panelTwo.add(developersNameText);
        
        specializationText = new JTextField();
        specializationText.setBounds(150,55,280,30);
        panelTwo.add(specializationText);
        
        appointedDateText = new JTextField();
        appointedDateText.setBounds(120,90,110,30);
        panelTwo.add(appointedDateText);
        
        terminationDateText = new JTextField();
        terminationDateText.setBounds(340,90,90,30);
        panelTwo.add(terminationDateText);
        
        evaluationPeriodText = new JTextField();
        evaluationPeriodText.setBounds(130,125,100,30);
        panelTwo.add(evaluationPeriodText);
        
        developerNo1Text = new JTextField();
        developerNo1Text.setBounds(360,125,70,30);
        panelTwo.add(developerNo1Text);
        
        //adding button to panel two
        panelTwoAppoint = new JButton("Appoint");
        panelTwoAppoint.setBounds(340,160,90,30);
        panelTwoAppoint.addActionListener(this);
        panelTwo.add(panelTwoAppoint);
        
        //Panel Three
        panelThree = new JPanel();
        panelThree.setBounds(25, 450, 450, 165);
        panelThree.setBorder(panelThreeTitle);
        panelThree.setLayout(null);
        this.add(panelThree);

        //Labels for Panel Three
        developersName = new JLabel("Developer's Name:");
        developersName.setBounds(10,20,150,30);
        panelThree.add(developersName);

        joiningDate = new JLabel("Joining Date:");
        joiningDate.setBounds(10,55,150,30);
        panelThree.add(joiningDate);

        advanceSalary = new JLabel("Advance Salary:");
        advanceSalary.setBounds(210,55,150,30);
        panelThree.add(advanceSalary);

        developerNo = new JLabel("Developer's Number: ");
        developerNo.setBounds(10,90,150,30);
        panelThree.add(developerNo);
        
        staffRoomNumber = new JLabel("Staff Room Number:");
        staffRoomNumber.setBounds(225,90,130,30);
        panelThree.add(staffRoomNumber);

        //Text field for Panel three

        developerName1Text = new JTextField();
        developerName1Text.setBounds(150,20,280,30);
        panelThree.add(developerName1Text);

        joiningDateText = new JTextField();
        joiningDateText.setBounds(100,55,100,30);
        panelThree.add(joiningDateText);

        advanceSalaryText = new JTextField();
        advanceSalaryText.setBounds(320,55,110,30);
        panelThree.add(advanceSalaryText);

        developerNoText = new JTextField();
        developerNoText.setBounds(150,90,70,30);
        panelThree.add(developerNoText);
        
        staffRoomNumberText = new JTextField();
        staffRoomNumberText.setBounds(350,90,80,30);
        panelThree.add(staffRoomNumberText);

        //adding button to panel three
        panelThreeAppoint = new JButton("Appoint");
        panelThreeAppoint.setBounds(230, 125,100,30);
        panelThreeAppoint.addActionListener(this);
        panelThree.add(panelThreeAppoint);
        
        panelThreeTerminate = new JButton("Terminate");
        panelThreeTerminate.setBounds(330,125,100,30);
        panelThreeTerminate.addActionListener(this);
        panelThree.add(panelThreeTerminate);
        
        //Buttons for the window
        
        display = new JButton("Display");
        display.setBounds(250,625,100,40);
        display.addActionListener(this);
        this.add(display);
        
        clear = new JButton("Clear");
        clear.setBounds(370,625,100,40);
        clear.addActionListener(this);
        this.add(clear);
        
    }
    
    public void message(String messageLabel, String displayLabel)
    {
        messageOne = new JFrame(messageLabel);
        messageOneMsg = new JLabel(displayLabel);
        
        messageOne.setSize(230,50);
        messageOne.setResizable(false);
        messageOne.setLocation(500,50);
        
        messageOneMsg.setBounds(100,100,150,30);
        messageOne.add(messageOneMsg);
        messageOne.setVisible(true);
    }
   
    
    public void actionPerformed(ActionEvent event)
    {

    int workingHourConverted;
    double salaryConverted;
    int contractPeriodConverted;
    int developerNo1Converted;
    int developerNoConverted;
    double advanceSalaryConverted;
    
        if(event.getSource() == panelOneAddJunior){
            
            if (platformText.getText().isEmpty() && interviewerNameText.getText().isEmpty() && workingHourText.getText().isEmpty() && salaryText.getText().isEmpty() && appointerText.getText().isEmpty()){
                
                
                message("Error 1","Mandatory field empty");

            }
            else {
                try{
                    
                    //Converting text fields with int or double   
                    salaryConverted = Double.parseDouble(salaryText.getText());
                    workingHourConverted= Integer.parseInt(workingHourText.getText());
                
                    Juniordeveloper junior = new Juniordeveloper(platformText.getText(),interviewerNameText.getText(),workingHourConverted,salaryConverted,appointerText.getText(),"");
                    list.add(junior);
                
                    message("Success", "Action Was Successful");
                }catch(NumberFormatException e){                
                    message("Error 2","Input given was incorrect data type");
                }catch(Exception e){
                    message("Error 99","Unknown Error");
                }
                
            }
         
        }
        
        if(event.getSource() == panelOneAddSenior){
            if (platformText.getText().isEmpty() && interviewerNameText.getText().isEmpty() && workingHourText.getText().isEmpty() && salaryText.getText().isEmpty() && contractPeriodText.getText().isEmpty()){
                message("Error 1","Mandatory Field Is Empty");

            }
            else {
                try{               
                    workingHourConverted= Integer.parseInt(workingHourText.getText());
                    salaryConverted = Double.parseDouble(salaryText.getText());
                    contractPeriodConverted = Integer.parseInt(contractPeriodText.getText());
                
                    SeniorDeveloper senior = new SeniorDeveloper(platformText.getText(),interviewerNameText.getText(),workingHourConverted,salaryConverted,contractPeriodConverted);
                    list.add(senior);
                
                    message("Success", "Action Was Successful");
                }catch(NumberFormatException e){                
                    message("Error 2","Input given was incorrect data type");
                }catch(Exception e){
                    message("Error 99","Unknown Error");
                }
                
            }
         
        }
        
        if (event.getSource() == panelTwoAppoint){
            if(developersNameText.getText().isEmpty() && specializationText.getText().isEmpty() && appointedDateText.getText().isEmpty() && terminationDateText.getText().isEmpty() && evaluationPeriodText.getText().isEmpty() && developerNo1Text.getText().isEmpty()){
                message("Error 1","Mandatory Field Is Empty");
            }
            else{
                try{
                    developerNo1Converted = Integer.parseInt(developerNo1Text.getText());
                    Developer juniord = list.get(developerNo1Converted);
                    Juniordeveloper juniordd = (Juniordeveloper)juniord; 
                    juniordd.Appoint_Platform(developersNameText.getText(),appointedDateText.getText(),terminationDateText.getText(),specializationText.getText());
                    juniordd.setEvaluation_Period(evaluationPeriodText.getText());
                    
                    
                    message("Success", "Action Was Successful");
                }catch(NumberFormatException e){
                    message("Error 2","Input given was incorrect data type");
                }catch(ArrayIndexOutOfBoundsException e){
                    message("Error 3","Invaild Developer Number");
                }catch(ClassCastException e){
                    message("Error 5","Not a junior");
                }catch(Exception e){
                    message("Error 6", "Developer number not valid");
                }
            }
        }
        
        if (event.getSource() == panelThreeAppoint) {
            if (developerName1Text.getText().isEmpty() && joiningDateText.getText().isEmpty() && advanceSalaryText.getText().isEmpty() && staffRoomNumberText.getText().isEmpty() && developerNoText.getText().isEmpty()){
                message("Error 1", "Mandatory field is empty");
            } else {
                try {
                    developerNoConverted = Integer.parseInt(developerNoText.getText());
                    Developer seniord = list.get(developerNoConverted);
                    SeniorDeveloper seniordd = (SeniorDeveloper)seniord;
                    advanceSalaryConverted = Double.parseDouble(advanceSalaryText.getText());
                    
                    
                    seniordd.hire(developerName1Text.getText(), joiningDateText.getText(), advanceSalaryConverted, staffRoomNumberText.getText());
                    message("Success", "Action was successful");
                } catch(NumberFormatException e) {
                    message("Error 2","Input given was incorrect data type");
                } catch(ArrayIndexOutOfBoundsException e){
                    message("Error 3","Invalid Developer Number");
                } catch(ClassCastException e) {
                    message("Error 5", "Not a senior");
                } catch(Exception e){
                    message("Error 6", "Developer number not valid");
                }
            }
        }
        
        if (event.getSource() == panelThreeTerminate) {
            if (staffRoomNumberText.getText().isEmpty()) {
                message("Error 7", "Developer number not entered");
            } else {
                try{
                    developerNoConverted = Integer.parseInt(developerNoText.getText());
                    Developer seniord = list.get(developerNoConverted);
                    SeniorDeveloper seniordd = (SeniorDeveloper)seniord;
                
                    seniordd.Terminate();
                    message("Success", "Termination complete");
                } catch(NumberFormatException e) {
                    message("Error 2","Input given was incorrect data type");
                } catch(ArrayIndexOutOfBoundsException e) {
                    message("Error 3","Invalid Developer Number");
                } catch(ClassCastException e) {
                    message("Error 5","Not a senior");
                } catch(Exception e) {
                    message("Error 3","Invalid Developer Number");
                }
            }
        }
        
        if (event.getSource() == clear) {
            try {
                platformText.setText("");
                interviewerNameText.setText("");
                workingHourText.setText("");
                salaryText.setText("");
                appointerText.setText("");
                contractPeriodText.setText("");
                developersNameText.setText("");
                specializationText.setText("");
                appointedDateText.setText("");
                terminationDateText.setText("");
                evaluationPeriodText.setText("");
                developerNo1Text.setText("");
                developerName1Text.setText("");
                joiningDateText.setText("");
                advanceSalaryText.setText("");
                developerNoText.setText("");
                staffRoomNumberText.setText("");
                              
            } catch(Exception e) {
                message("Error 99", "Unknown Error");
            }
        }
        
        if (event.getSource() == display) {
            try {
                platformText.setText("Enter Text");
                interviewerNameText.setText("Enter Text");
                workingHourText.setText("Enter Number");
                salaryText.setText("Enter Number");
                appointerText.setText("Enter Text");
                contractPeriodText.setText("Enter Number");
                developersNameText.setText("Enter Text");
                specializationText.setText("Enter Text");
                appointedDateText.setText("Enter Text");
                terminationDateText.setText("Enter Text");
                evaluationPeriodText.setText("Enter Text");
                developerNo1Text.setText("Enter Number");
                developerName1Text.setText("Enter Text");
                joiningDateText.setText("Enter Text");
                advanceSalaryText.setText("Enter Number");
                developerNoText.setText("Enter Number");
                staffRoomNumberText.setText("Enter Text");
                              
            } catch(Exception e) {
                message("Error 99", "Unknown Error");
            }
        }
    }
    
    public static void main(String[] args)
    {
        RigoTech run = new RigoTech();
        run.setVisible(true);
    }
   
}
