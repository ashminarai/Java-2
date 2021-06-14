
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //Here, we create a constructor for FullTimeStaffHire which contain six parameters//
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(jobType, designation, vacancyNumber);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    } 

    /*Here, we create a setter method of salary whose return type is void.If joined is equal to true 
    then the value won't be updated else the instance variable of salary will be updated*/
    public void setSalary(int salary){
        if (joined==true){
            System.out.println("Salary is already set, the value cannot be updated\n");}
        else
        {this.salary=salary;
        }
    }
    //Here, we create a getter method of salary to return the variable of salary from FullTimeStaffHire class//
    public int getSalary(){
        return salary;
    }
    //Here, we create a setter method of workingHour to set or store the variable of workingHour//
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }
    //Here, we create a getter method of workingHour to return the variable of workingHour from FullTimeStaffHire class//
    public int getWorkingHour(){
        return workingHour;
    }
    //Here, we create a setter method of staffName to set or store the variable of staffName//
    public void setStaffName(String staffName){ 
        this.staffName=staffName;
    }
    //Here, we create a getter method of staffName to return the variable of staffName from FullTimeStaffHire class//
    public String getStaffName(){
        return staffName;
    }
    //Here, we create a setter method of joiningDate//
    public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
    }
    //Here, we create a getter method of joiningDate to return the variable of joiningDate from FullTimeStaffHire class//
    public String getJoiningDate(){
        return joiningDate;
    }
    //Here, we create a setter method of qualification//
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    //Here, we create a getter method of qualification to return the variable of qualification from FullTimeStaffHire class//
    public String getQualification(){
        return qualification;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
    }
    //Here, we create the getter method of appointedBy to return the variable of appointedBy from FullTimeStaffHire class//
    public String getAppointedBy(){
        return appointedBy;
    }

    public void  setJoined(Boolean joined){
        this.joined=joined;
    }
    //Here, we create the getter method of joined to return the variable of joined from FullTimeStaffHire class//
    public boolean getJoined(){
        return joined;
    }

    /*Here, we create a setter method of FullTimeStaffHire whose return type is void.If joined is equal to true 
    then the value won't be updated else the instance variable of FullTimeStaffHire will be updated*/
    public void FullTimeStaffHire(String staffName,String joiningDate, String qualification, String appointedBy){
        if(joined==true){
            System.out.println("fullTimeStaffHire is already appointed, so the new value cannot be updated");
            System.out.println("staffName= "+this.staffName);
            System.out.println("joiningDate= "+this.joiningDate);
            System.out.println("");
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
    }
    //Here, we create a method to display all the attributes//
    public void display(){
        super.display();
        if(joined==true){
            System.out.println("staffName= "+staffName);
            System.out.println("salary= "+salary);
            System.out.println("workingHour= "+workingHour);
            System.out.println("joiningDate= "+joiningDate);
            System.out.println("qualification= "+qualification);
            System.out.println("appointedBy= "+appointedBy);
            System.out.println();
        }
    }
}
