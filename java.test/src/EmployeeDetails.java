public class EmployeeDetails {

    public String eName;
    public int eID;
    public double eSalary;
    public double salaryBonus(double eSalary)
    {
        return 2*eSalary;
    }
    public void displayDetails(String eName, int eID)
    {
        System.out.println("Employee Name: "+eName+"\n"+"Employee ID: "+eID);
    }
    public static void main(String args[])
    {
        EmployeeDetails ed=new EmployeeDetails();
        ed.displayDetails("Mouni",10001);
        ed.salaryBonus(25000.02);
    }
}
