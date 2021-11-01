package Array.src;
import java.util.HashMap;

public class In_Class_Map_Demo {
    public static void main(String[] args){

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Jerry"));

        System.out.println(empIds.containsValue(8675309));

        empIds.put("John", 56787);
        System.out.println(empIds);

        empIds.replace("John", 789);
        //won't replace if it doesn't exist
        System.out.println(empIds);

        empIds.putIfAbsent("Stacey's mom", 222);
        //will only update if key doesn't exist
        System.out.println(empIds);

        empIds.remove("Stacey's mom");
        System.out.println(empIds);
        

    }
}
