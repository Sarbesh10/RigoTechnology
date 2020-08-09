public class SeniorDeveloper extends Developer
{
    float salary;
    String joiningDate;
    String staffRoomNumber;
    int contractPeriod;
    float advanceSalary;
    boolean appointed;
    boolean terminated;
    
    public SeniorDeveloper(String platform,String interviewerName,int workingHours,float salary,int contractPeriod){
        super(platform,interviewerName,workingHours);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0;
        appointed=false;
        terminated=false;
    }
    
    public float getSalary(){
    return salary;
    }
    
    public String getJoiningDate(){
    return joiningDate;
    }
    
    public String getStaffRoomNumber(){
    return staffRoomNumber;
    }
    
    public int getContractPeriod(){
    return contractPeriod;
    }
    
    public float getAdvanceSalary(){
    return advanceSalary;
    }
    
    public boolean getAppointed(){
    return appointed;
    }
    
    public boolean getTerminated(){
    return terminated;
    }
    
    public void setSalary(float salary){
        this.salary=salary;
    }
    
    public void setContractPeriod(int contractPeriod){
        this.contractPeriod=contractPeriod;
    }
    
    public void hireDeveloper(String developerName,String joiningDate,float advanceSalary,String staffRoomNumber){
        if(appointed==true){
            System.out.println("Interviewer's Name: "+getDeveloperName());
            System.out.println("Room Number: "+staffRoomNumber);
        }
        else{
            setDeveloperName(developerName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
        }
    }
    
    public void contractTermination(){
            if(terminated==true){
                System.out.println("Developer is terminated.");
            }
            else{
                setDeveloperName("");
                joiningDate="";
                advanceSalary=0;
                appointed=false;
                terminated=true;
            }
        }
    
        public void printIt(){
            System.out.println("Platform: "+getPlatform());
            System.out.println("Interviewer's Name: "+getInterviewerName());
            System.out.println("Salary: "+salary);
        }
        
        public void display(){
            super.display();
            if(appointed==true){
                System.out.println("Termination Status: "+terminated);
                System.out.println("Joining Date: "+joiningDate);
                System.out.println("Advance Salary: "+advanceSalary);
                System.out.println("Developer Name: "+getDeveloperName());
            }
        }
}