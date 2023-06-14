public class Address {
    public String street;

    public String city;
    public String zipcode;
    public String country;

    public Address(String street,String city,String zipcode,String country)
    {
        this.street=street;
        this.city=city;
        this.zipcode=zipcode;
        this.country=country;
    }
    @Override
    public String toString()
    {
        return street+" "+city+" "+zipcode+" "+country;
    }



}
