public class Janitor extends Employee {
    //Define the parameterized constructor.

    public Janitor(String nname, String naddress,

                   String npnumber, String n_sn)

    {

        super(nname, naddress, npnumber, n_sn);

    }



    //Define the function for defining the service.

    public void Janitor_service()

    {

        System.out.println("Janitor is taking "

                + "care of the cleanliness.");

    }
}
