package Day7_032721;

public class Array_List {

    public static void main(String[] args) {

        Day7_032721.java.util.Array_List<String> cities = new Day7_032721.java.util.Array_List();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten Island");
        cities.add("Bronx");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println("My city is " + cities.get(1));
        }
    }
}