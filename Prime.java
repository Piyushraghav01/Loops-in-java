// import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        

        for( int n = 2; n<=50; n++){
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("not Prime");
                    isPrime = false;
                    break;
                }
            }
    
            if (isPrime) {
                System.out.println(n);
            } 

        }

        

        // sc.close();
    }

}
