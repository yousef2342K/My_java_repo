 public static void main(String[] argv) {
        int x, n;

        for (n = 2; n <= 20; n++) {
            for (x = 2; x < n; x++) {
                if (n % x == 0) {
                    System.out.println(n  + "\t equals\t" + x + " * " + n/x);
                    break;
                }
            }

            // Print that the number is prime only if it is not divisible by any number less than itself.
            if (x == n) {
                System.out.println(n + " is a prime number");
            }
        }
