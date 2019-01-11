import java.util.ArrayList;

/**
 * @author callmezh
 */
public class TestArrayList {
    static void printResult(){
        //create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        //Add some cities in the list
        cityList.add("London");
        //cityList now has London
        cityList.add("Denver");
        //cityList now has contains [London, Denver]
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

//        String city = cityList.get(2);

        System.out.println("List size: " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        //Insert a new city at index 2, index begins 0
        cityList.add(2, "xian");
        //Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        //remove a city in the index 1
        cityList.remove(1);
        //contains [London, Xian, Paris, Seoul, Tokyo]

        //Display the contents in the list
        System.out.println(cityList.toString());

        //Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--){
            System.out.print(cityList.get(i) + "  ");
        }
        System.out.println();

        //Create a list to store two circles
        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();

        //Add two circles
        list.add(new CircleFromSimpleGeometricObject());
        list.add(new CircleFromSimpleGeometricObject());

        //Display the area of the first circle in the list
        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}
