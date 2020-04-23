public class Receptionist extends Employee {
    //Define the parameterized constructor.

    public Receptionist(String nname, String naddress,

                        String npnumber, String n_sn)

    {

        super(nname, naddress, npnumber, n_sn);

    }



    //Define the function to define the type

    //of the Receptionist.

    public void receptionist_type()

    {

        System.out.println("Receptionist maintaining"

                + " and creating the reports.");

    }



    //Define the function for defining the service.

    public void receptionist_service()

    {

        System.out.println("Receptionist making the calles "

                + "and answering the phone calls.");

    }
}
