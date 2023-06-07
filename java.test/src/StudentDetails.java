public class StudentDetails {
    public int sID;
    public String sName;
    public float sGPA;
    public void displayName()
    {
        System.out.println("Name :"+sName);
    }
    public int displayID()
    {
        return sID;
    }

    public static void main(String args[])
    {
        StudentDetails sd = new StudentDetails();
        sd.sName="Mouni";
        sd.sID=101;
        System.out.println("ID :"+sd.displayID());
        sd.displayName();
    }
}
