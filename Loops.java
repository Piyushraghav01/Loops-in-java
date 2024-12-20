import java.util.Scanner;

class Loops {
    public static void main(String[] args) {
        // Print numbers from 1-n

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int i;

        for (i = 1; i <= 15; i++) {
            System.out.println(i);
        }
        System.out.println("Outside Loop");
        System.out.println(i);

        sc.close();

    }

}
