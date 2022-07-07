import java.util.HashMap;

class Main39 {
  public static void main(String[] args) {

    // create an HashMap
    HashMap<Integer, String> languages = new HashMap<>();

    // add entries to HashMap
    languages.put(1, "Python");
    languages.put(2, "English");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);

    // replace mapping for key 2
    String value = languages.replace(2, "Java");

    System.out.println("Replaced Value: " + value);
    System.out.println("Updated HashMap: " + languages);
  }
}