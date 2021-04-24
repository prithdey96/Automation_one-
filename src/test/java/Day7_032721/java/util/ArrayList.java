package Day7_032721.java.util;

public class Array_List {
    public static void main(String[] args) {

        Array_List<String> cities = new Array_List<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");
        cities.add("Bronx");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println("My city is " + cities.get(1));
        }
    }
}// end of java class

