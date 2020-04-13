public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    public int t1, t2, t3;





    public void setTestScore (int testnum,int scoreofthetest)
    {

        int slob = scoreofthetest;
        switch (testnum){
            case 1 :
                int test1 = scoreofthetest;
                break;
            case 2 :

                int test2 = scoreofthetest;
                break;
            case 3 :

                int test3 = scoreofthetest;
                break;
            default :
                int t4 = -1;
        }

    }




    public float average ()

    {
        float ave = (t1 + t2 + t3) / 3;

        return ave;
    }



    public Student (String first, String last, Address home,
                    Address school,int test1,int test2, int test3)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;

        int t1 = test1;
        int t2 = test2;
        int t3 = test3;



    }




    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test scores:\n" + t1 + "," + t2 + "," + t3 + ".";
        result += "The average test score is:\n" + average();
        return result;
    }







}





