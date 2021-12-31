import java.security.cert.X509Certificate;

class ComparisonAndAssignmentDemo {

    public static void main(String[] args){

        /*
            Note the difference between "==" and "=".
        */
        boolean x = 6 == 6; // Note the difference between "==" and "="
        System.out.println(x);

        /*
            Comparison Operators
        */
        System.out.println("10 is greater than 9 " + (10 > 9));
        System.out.println("10 is lesser than 9 " + (10 < 9));
        System.out.println("10 is equals to 10 " + (10 == 10));
        System.out.println("10 is equals or lesser than 10 " + (10 <= 10));
        System.out.println("10 is equals or greater than 10 " + (10 >= 10));
        System.out.println("10 is not equals to 9 " + (10 != 9));

        /*
            Assignment Operators
        */

        int y = 5;
        System.out.println(y += 1); // Equivalent to y = y + 1

        int z = 4;
        System.out.println(z -= 1); // Equivalent to z = z - 1
    }
}
