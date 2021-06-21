package collections.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a",10);
		hm.put("b",20);
		hm.put("c",30);
		
		System.out.println("Size of map is = " + hm.size());
		System.out.println(hm);
		
		if(hm.containsKey("a")) {
			Integer a = hm.get("a");
			System.out.println("Value for key \"a\" is " + a);
		}
		
		for(String key : hm.keySet()) {
			System.out.println("Key = " + key + " And Value = " + hm.get(key));
		}
		
		for(Entry<String,Integer> entry : hm.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " And Value = " + entry.getValue());
		}
		
	}

}
