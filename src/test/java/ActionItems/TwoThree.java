package ActionItems;

public class TwoThree {
        public static void main(String[] args) {
            String[] cities = new String[4];
            cities[0] = "Brooklyn";
            cities[1] = "Manhattan";
            cities[2] = "Queens";
            cities[3] = "Staten Island";


            //using for loop print only when city is Manhattan or Brooklyn
            for (int i = 0; i < cities.length; i++) {
                if (cities[i] == "Brooklyn") {
                    System.out.println("City is " + cities[i]);
                } else if (cities[i] == "Manhattan") {
                    System.out.println("City is " + cities[i]);

                }//end of conditional statement
            }//end of for loop
        }//end of main method
    }// end of java class














