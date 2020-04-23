public class Nurse extends Employee {
    //Define the parameterized constructor.

    public Nurse(String nname, String naddress,

                 String npnumber, String n_sn)

    {

        super(nname, naddress, npnumber, n_sn);

    }



    //Define the function.

    public void medicine()

    {

        System.out.println("Nurse gives the "

                + "medicines to the patients.");

    }



    //Define the function for defining the service.

    public void nurse_service()

    {

        System.out.println("Nurse taking care of patients.");

    }
}
