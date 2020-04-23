public class Administrator extends Employee {
    //Define the parameterized constructor.

    public Administrator(String nname, String naddress,

                         String npnumber, String n_sn)

    {

        super(nname, naddress, npnumber, n_sn);

    }



    //Define the function that describes

    //the functioning of a administrator.

    public void managing()

    {

        System.out.println("Administrator manages"

                + " the equipments.");

    }



    //Define the function for defining the service.

    public void administrator_service()

    {

        System.out.println("Administrator is taking"

                + "care of the budgets.");

    }
}
