public class EmployeeDetails {

    public String eName;
    public static String orgName;
    public int eID;
    public double eSalary;
    public String addr;
    public EmployeeDetails()
    {

    }
    public EmployeeDetails(String eName,int eID)
    {
        this.eName=eName;
        this.eID=eID;
    }

    public double salaryBonus(double eSalary)
    {
        return 2*eSalary;
    }
    public void displayDetails(String eName, int eID)
    {
        System.out.println("Employee Name: "+eName+"\n"+"Employee ID: "+eID);
    }
    public static void orgAddress()
    {
        System.out.println("Cary, North Carolina");
    }
    public static void main(String args[])
    {
        EmployeeDetails ed=new EmployeeDetails();
        EmployeeDetails.orgName="Technodeed";
        Address a =new Address("514 pemberwich pl","Cary","27519","USA");
        ed.displayDetails("Mouni",10001);
        System.out.println("Salary Bonus: "+ed.salaryBonus(25000.02));
        System.out.println("Address:"+a);
        System.out.println("organization Name: "+orgName);
        EmployeeDetails.orgAddress();
    }
}
