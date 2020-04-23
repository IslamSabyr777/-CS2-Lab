public class Test {
    public static void main(String[] args)
    {
        Doctor d = new Doctor("Mr. Doctor", "401 Street"

                + " Floor 1", "11111", "111-111",

                " Brain Specialist");



        Nurse n = new Nurse ("Sheetal", "402 Street "

                + "Floor 2", "22222","222-222");



        Administrator a = new Administrator

                ("Mr. Administrator", "403 Street"

                        + " Floor 3", "33333", "333-333");



        Surgeon s = new Surgeon("Mr. Surgeon",

                "404 Street Floor 4", "44444",

                "444-444", "Brain Surgeon");



        Receptionist r = new Receptionist("Mr. Reception"

                + "ist", "405 Street Floor 5",

                "55555", "555-555");



        Janitor j = new Janitor ("Mr. Janitor",

                "406 Street Floor 6", "66666", "666-666");



        //Call the functions of each class to display the

        //information of Doctor, Nurse, Administrator,

        //Surgeon, Receptionist, and the Janitor.

        d.Display_information();

        d.doctor_service();



        System.out.println("\n");

        n.Display_information();

        n.medicine();

        n.nurse_service();



        System.out.println("\n");

        a.Display_information();

        a.managing();

        a.administrator_service();



        System.out.println("\n");

        s.Display_information();

        s.surgeon_service();



        System.out.println("\n");

        r.Display_information();

        r.receptionist_type();

        r.receptionist_service();



        System.out.println("\n");

        j.Display_information();

        j.Janitor_service();
    }
}
