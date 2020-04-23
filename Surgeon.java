public class Surgeon extends Employee {
    String surgeon_expertise;



    //Define the parameterized constructor.

    public Surgeon(String nname, String naddress,

                   String npnumber, String n_sn, String expert)

    {

        super(nname, naddress, npnumber, n_sn);

        surgeon_expertise = expert;

    }



    //Define the function for defining the service.

    public void surgeon_service()

    {

        System.out.println("Surgeon taking is operating.");

    }

}
