import java.util.Scanner;

public class handshakes {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        System.out.print("Enter N Input: ");
        n = sc.nextInt ();
        n = n * (n-1) / 2;
        System.out.println("Maximum numbers of handshakes: " +n);
    }


}

