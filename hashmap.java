import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
      Map<String,Integer> mp = new HashMap<>();
      mp.put ("rahul",1);
      mp.put ("ram",2);
      mp.put ("aman",3);
      mp.put ("mad",4);
      mp.put ("sad",5);
      System.out.println(mp.get("mad"));
     System.out.println( mp.remove("ram"));
      System.out.println(mp.remove("vol"));
      System.out.println(mp.containsKey("ram"));
      System.out.println(mp.containsKey("mad"));
      mp.putIfAbsent("ramu",2);
      System.out.println(mp.keySet());
      System.out.println(mp.values());
      System.out.println(mp.entrySet());
      for(String key: mp.keySet())
      {
        System.out.printf("%s has %d balls\n",key,mp.get(key));
      }
      System.out.println();
      for(Map.Entry<String,Integer> e: mp.entrySet())
      {
        System.out.printf("%s has %d balls\n",e.getKey(),e.getValue());
      }
      System.out.println();
      for(var e: mp.entrySet())
      {
        System.out.printf("%s has %d balls\n",e.getKey(),e.getValue());
      }
      
  }
}