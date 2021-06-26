package b_Easy;

import java.util.HashMap;
import java.util.Map;

/*
Create a method that takes a Map<String, String> and return the values as a separate array. Return the keys sorted alphabetically, and their corresponding values in the same order.

Examples
getValues({ "a": "1", "b": "2", "c": "3" } )
➞ ["1", "2", "3"]

getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
➞ ["Apple", "Microsoft", "Google"]

getValues({ "key1": "true", "key2": "false", "key3": "undefined" })
➞ ["true", "false", "undefined"]
Notes
Remember to sort the keys.
 */
public class E_117_Map_to_values_Array {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

           String [] arr =     print(map);

           for(String x : arr) System.out.println(x);
    }

    static  String [] print(Map<String, String> map){

        return map.values().toArray(new String[map.values().size()]);

    }
}

