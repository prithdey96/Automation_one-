package Day3_031321;

public class SwitchCaseStatements {
    public static void main(String[] args){

        /* using switch case statements print
        is milkType is OatMilk, AlmondMilk or OrganicMilk
        else milk type is not recognized
         */

        //declare and define the variable for milkType
        String milkType = "soy Milk";
        switch (milkType){
            case "OatMilk":
                System.out.println("Milk type is OatMilk");
                break;
            case "AlmondMilk":
                System.out.println("Milk type is AlmondMilk");
                break;
            case "OrganicMilk":
                System.out.println("Milk type is OrganicMilk");
                break;
            default: //none of the cases were met
                System.out.println("Milk type is not recognized  " + milkType);
        }//end of switch statement




}//end of main method
}//end of java class
