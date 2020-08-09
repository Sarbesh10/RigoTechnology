public class Developer
{
    String platform;
    String interviewerName;
    String developerName;
    int workingHours;
    
    public Developer(String platform,String interviewerName,int workingHours){
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHours=workingHours;
        developerName="";
        
    }
    
    public String getPlatform(){
        return platform;
    }
    
    public String getInterviewerName(){
        return interviewerName;
    }
    
    public String getDeveloperName(){
        return developerName;
    }
    
    public int getWorkingHours(){
        return workingHours;
    }
    
    public void setDeveloperName(String developerName){
        this.developerName=developerName;
    }
    
    public void display(){
        System.out.println("This course taken is: "+platform);
        System.out.println("The Total Hours is: "+workingHours);
        System.out.println("The Interviewer's name: "+interviewerName);
        if(!developerName.equals("")){
            System.out.println("The Developer's name is: "+developerName);
        }
    }
}