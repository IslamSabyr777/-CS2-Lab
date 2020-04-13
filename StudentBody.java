public class StudentBody {
    public static void main (String[] args)
    {
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                "PA", 19085);

        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                "VA", 24551);
        Student john = new Student ("John", "Smith", jHome, school,80,90,70);
        john.setTestScore(1,80);



        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                44132);

        Student marsha = new Student ("Marsha", "Jones", mHome, school,40,70,90);
        marsha.setTestScore(2,70);



        System.out.println (john);


        System.out.println ();
        System.out.println (marsha);



    }

}

