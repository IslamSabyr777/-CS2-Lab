public class Doctor extends Employee {
    protected String expert_information;



    //Define the parameterized constructor.

    public Doctor(String name, String address,

                  String pnumber, String sn, String expert)

    {

        super(name, address, pnumber, sn);

        expert_information = expert;

    }



    //Define the function to display the information.

    public void Display_information()

    {

        System.out.println("Name : " + Name);

        System.out.println("Address : " + Address);

        System.out.println("Phone number : "

                + phone_number);

        System.out.println("Security Name : "

                + security_number);

        System.out.println("Specialization : "

                + expert_information);

    }



    //Define the function for defining the service.

    public void doctor_service()

    {

        System.out.println("Doctor is diagonizing"

                + " the illness.");

    }

}
