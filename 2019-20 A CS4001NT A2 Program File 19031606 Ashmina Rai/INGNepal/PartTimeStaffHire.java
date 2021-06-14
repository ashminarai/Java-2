
/**
 * Write a description of class partTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    /*Here, we create a constructor of PartTimeStaffHire which contain six parameter as vacancyNumber, designation, jobType, workingHour
    wagesPerHour and shifts of data type String, String, int, int and String respectively*/
    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType, int workingHour, int wagesPerHour, String shifts){
        //Here, we call a super class with three parameters// 
        super(jobType,designation,vacancyNumber);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    //Here, we create a getter method of workingHour to return the variable of workingHour from PartTimeStaffHire class//
    public int getWorkingHour(){
        return workingHour;
    }

    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }
    //Here, we create a getter method of wagesPerHour to return the variable of wagesPerHour from PartTimeStaffHire class//
    public int getWagesPerHour(){
        return wagesPerHour;
    }

    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour=wagesPerHour;
    }
    //Here, we create a getter method of staffName to return the variable of staffName from PartTimeStaffHire class//
    public String getStaffName(){
        return staffName;
    }

    public void setStaffName(String staffName){
        this.staffName=staffName;
    }
    //Here, we create a getter method of joiningDate to return the variable of joiningDate from PartTimeStaffHire class//
    public String getJoiningDate(){
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate){
        this.joiningDate=joiningDate;
    }
    //Here, we create a getter method of qualification to return the variable of qualification from PartTimeStaffHire class//
    public String getQualification(){
        return qualification;
    }
    //
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    //Here, we create a getter method of appointedBy to return the variable of appointedBy from PartTimeStaffHire class//
    public String getAppointedBy(){
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy){
        this.appointedBy=appointedBy;
    }
    //Here, we create a getter method of shifts to return the variable of shifts from PartTimeStaffHire class//
    public String getShifts(){
        return shifts;
    }

    public void setShifts(String shifts){
        this.shifts=shifts;
    }
    //Here, we create a getter method of joined to return the variable of joined from PartTimeStaffHire class//
    public boolean getJoined(){
        return joined;
    }

    public void setJoined(boolean joined){
        this.joined=joined;
    }
    //Here, we create a getter method of terminated to return the variable of terminated from PartTimeStaffHire class//
    public boolean getTerminated(){
        return terminated;
    }

    public void setTerminated(boolean terminated){
        this.terminated=terminated;
    }

    /*Here, we create a setter method for shifts whose return type is void. If joined is equal to true then the value can't be
    updated else instance variable will be updated.*/
    public void Shifts(String shifts){
        if (joined==true){
            System.out.println("Shifts already exist thus,it cant be updated\n");
        }
        else
        {
            this.shifts=shifts;
        }
    }

    /*Here, we create a method of PartTime StaffHire which has parameter staffName, joiningDate, qualification and appointedBy.The return
    type of method is void. If joined is equal to true value will be updated else instance variable will be updated*/
    public void PartTimeStaffHire(String staffName,String joiningDate,String qualification,String appointedBy){
        if(joined==true){
            System.out.println("PartTimeStaffHire already exists,thus it can't be updated");
            System.out.println("staffName= "+this.staffName);
            System.out.println("joinDate= "+this.joiningDate);
            System.out.println();
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
    }

    /*Here, we create a method of terminated whose return type of method is void. If terminated is equal to true the value won't be
    updated else instance variable will be updated*/
    public void terminated(){
        if (terminated==true){
            System.out.println("Since, the value already exist, it can't be updated\n");}
        else
        {
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            joined=false;
            terminated=true;
        }
    }

    /* Here, we created a method display whose return type of method is void. If joined is equal to true then all the variables will
    be displaye */
    public void display(){
        super.display();
        int incomePerDay=wagesPerHour*workingHour;
        if(joined==true){
            System.out.println("staffName= "+staffName);
            System.out.println("wagesPerHour= "+wagesPerHour);
            System.out.println("workingHour= "+workingHour);
            System.out.println("joiningDate= "+joiningDate);
            System.out.println("qualification= "+qualification);
            System.out.println("appointedBy= "+appointedBy);
            System.out.println("incomePerDay= "+incomePerDay);
            System.out.println();
        }

    }
}
