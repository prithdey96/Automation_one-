package ActionItems;

public class One {
    public static void main(String[] args) {

        //declare zipcode variables
        String[] zipcodes;

        //declare integer variables
        int[] StreetNumber;

        //set the length of the array for zipcodes
        zipcodes = new String[4];
        zipcodes[0] = "11373";
        zipcodes[1] = "11374";
        zipcodes[2] = "11375";
        zipcodes[3] = "11376";

        //set the length of the array to StreetNumber
        StreetNumber = new int[4];
        StreetNumber[0] = 1001;
        StreetNumber[1] = 1002;
        StreetNumber[2] = 1003;
        StreetNumber[3] = 1004;

        //set the iteration to loop
        for (int i = 0; i < zipcodes.length; i++) {
            System.out.println(" The zip code is " + zipcodes[i] + " and the street number is " + StreetNumber[i]);


        }//end of main method

    }//end of loop
}// end class
