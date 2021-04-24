package Day3_031321;

public class IfElseExamples {

    public static void main(String[] args) {
        //declare the integer variables
        int a, b;
        a = 3;
        b = 3;

        //using if condition, verify that a is less than b
        if (a < b) {
            System.out.println("a is less than b");
        }//end of if condition

        //using if else condition, verify if a is less than b, else it is greater or equal to b
        if (a < b){
            System.out.println("a is less than b");

    } else {
        System.out.println("a is either greater than be or equal to b");
    }//end of if else

        //using <= operator verify is a is less than b or equal to b
        if ( a <= b){
            System.out.println(" a is less than be or a is equal to b");
        }//end of if condition


}//end of main method

}//end of java class
