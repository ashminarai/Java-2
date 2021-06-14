
public class StaffHire{
    private String jobType;
    private String designation;
    private int vacancyNumber;
    // Here, we create a constructor of StaffHire which consists of three attributes named as jobType,designation and vacancy//
    public StaffHire(String jobType,String designation,int vacancyNumber){
        this.jobType=jobType;
        this.designation=designation;

        this.vacancyNumber=vacancyNumber;
    }
    //Here,we create a getter method for jobType//
    public String getJobType(){
        return jobType;
    }
    //Here,we create a setter method for jobType//
    public void setJobType(String jobType){
        this.jobType=jobType;
    }
    //Here,we create a getter method for designation//
    public String getDesignation(){
        return designation;
    }
    //Here,we create a setter method for designation//
    public void setDesignation(String designation){
        this.designation=designation;
    }
    //Here we crete a getter method for vacancyNumber//
    public int getVacancyNumber(){
        return vacancyNumber;
    }
    //Here, we create a setter method for vacancyNumber//
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber=vacancyNumber;
    }

    public void display(){
        System.out.println("jobType= "+jobType);
        System.out.println("designation= "+designation);
        System.out.println("vacancyNumber= "+vacancyNumber);
    }
}                       

