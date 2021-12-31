class LogicDemo {

    public static void main (String[] args){
        
        /*
            Simple logical operator
        */
        
        System.out.println(true || false); // Returns true when one of the statements is true.

        System.out.println(true && false); // Returns true only when both statements are true.

        System.out.println(!true); // Returns the reversed result.


        /*
            Logical operator with expressions
        */
        boolean x = 10 > 9 || 20 < 10;
        System.out.println(x); // 10 is greater than 9, so it will print true.
        
        boolean y = 10 > 9 && 20 < 10;
        System.out.println(y); // 20 is lesser than 10 is not true, so it will print false.

        boolean z = !(10 > 9);
        System.out.println(z); // 10 is greater than 9 is true, it will print the reverse, which is false.
    }
}
