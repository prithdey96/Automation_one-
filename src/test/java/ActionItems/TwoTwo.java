package ActionItems;

public class TwoTwo {
    public static void main(String[] args) {

    /* using switch case statements print
        is grade Excellent, WellDone, Satisfactory, Passed, Fail
        else grade is not not recognized/invalid */
        //declare and define the variables for grade
        String grade = "grade is B";
        switch (grade) {
            case "grade is A":
                System.out.println("Excellent");
                break;
            case "grade is B":
                System.out.println("Well Done");
                break;
            case "grade is C":
                System.out.println("Satisfactory");
                break;
            case "grade is D":
                System.out.println("Passed");
                break;
            case "grade is F":
                System.out.println("Fail");
                break;
            default: //none of the cases were met
                System.out.println("invalid grade");

                //end of switch statement


        }// end of main method
    }//end of java class
}


