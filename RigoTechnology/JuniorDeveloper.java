public class JuniorDeveloper extends Developer
{
    float salary;
    String appointedDate;
    String evaluationPeriod;
    String terminationDate;
    String specialization;
    String appointedBy;
    boolean joined;
    
    public JuniorDeveloper(String platform,String interviewerName,int workingHours,float salary,String appointedBy,String terminationDate){
        super(platform,interviewerName,workingHours);
        this.salary=salary;
        this.appointedBy=appointedBy;
        this.terminationDate=terminationDate;
        appointedDate="";
        evaluationPeriod="";
        specialization="";
        joined=false;
    }
    
    public float getSalary(){
        return salary;
    }
    
    public String getAppointedDate(){
        return appointedDate;
    }
    
    public String getEvaluationPeriod(){
        return evaluationPeriod;
    }
    
    public String getTerminationDate(){
        return terminationDate;
    }
    
    public String getSpecialization(){
        return specialization;
    }
    
    public String getAppointedBy(){
        return appointedBy;
    }
    
    public boolean getJoined(){
        return joined;
    }
    
    public void setSalary(float salary){
        if(joined==false){
            this.salary=salary;
        }
        else{
            System.out.println("It is not possible to change the salary.");
        }
    }
    
    public void appointDeveloper(String developerName,String appointedDate,String terminationDate,String specialization){
        if(joined==false){
            setDeveloperName(developerName);
            joined=true;
        }
        else{
            System.out.println("Developer is already appointed on "+appointedDate);
        }
        this.terminationDate=terminationDate;
        this.specialization=specialization;
        }
        
        public void display(){
            super.display();
            if(joined==true){
                System.out.println("Appointed Date: "+appointedDate);
                System.out.println("Developer Name: "+getDeveloperName());
                System.out.println("Evaluation Period: "+evaluationPeriod);
                System.out.println("Termination Date: "+terminationDate);
                System.out.println("Salary: "+salary);
                System.out.println("Specialization: "+specialization);
                System.out.println("Appointed By: "+appointedBy);
            }
        }
    
}