public class Employee {
    //Declare the variables.

    protected String Name;

    protected String Address;

    protected String phone_number;

    protected String security_number;



    //Define the parameterized constructor.

    public Employee(String name, String address,

                    String pnumber, String sn)

    {

        Name = name;

        Address = address;

        phone_number = pnumber;

        security_number = sn;

    }



    //Define the function to display the information.

    public void Display_information()

    {

        System.out.println("Name : " + Name);

        System.out.println("Address : " + Address);

        System.out.println("Phone number : " + phone_number);

        System.out.println("Security Name : "

                + security_number);

    }
}
