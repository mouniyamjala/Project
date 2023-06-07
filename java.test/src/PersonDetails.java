public class PersonDetails {
    public int pID;
    public String pName;
    public void displayPersonDetails()
    {
        System.out.println("Person Name :"+pName+"\n"+"Person ID :"+pID);
    }
    public static void main(String args[])
    {
        PersonDetails pd = new PersonDetails();
        pd.pName="Bhanu";
        pd.pID=2001;
        pd.displayPersonDetails();
    }
}
