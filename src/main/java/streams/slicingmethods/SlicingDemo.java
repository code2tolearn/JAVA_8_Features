package streams.slicingmethods;
import java.util.ArrayList;
import java.util.List;

public class SlicingDemo {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>() ;
        countryList.add("USA");
        countryList.add("UK");
        countryList.add("India");
        countryList.add("Canada");
        countryList.add("Chine");
        countryList.add("India");
        countryList.add("USA");
    // Getting unique values from collection
      countryList.stream()
              .distinct()
              .forEach(System.out::println) ;
   // How many records you want from collection
        System.out.println("*****************************************");
      countryList.stream()
              .limit(3)
              .forEach(System.out::println);
        System.out.println("******************************************");
      countryList.stream()
              .skip(2)
              .forEach(System.out::println);
        System.out.println("****************************************** These are the intermediate methods");
    }
}
