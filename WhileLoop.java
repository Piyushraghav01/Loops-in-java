class WhileLoop {
    public static void main(String[] args) {
        // print 1-10 numbers using while loop

        int i = 1;
        int sum = 0;
        while (true) {

            sum = sum + i;
            if (sum >= 50) {
                break;
            }
            System.out.println(i);
            i++;

        }

        System.out.println(sum);
        System.out.println(i);

    }

}
