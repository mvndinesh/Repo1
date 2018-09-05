package prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hashmap = new HashMap();
		hashmap.put("dinesh",10);
		hashmap.put("sruthi",20);
		hashmap.put("ishan",30);
		
		if (hashmap.containsKey("dinesh")) {
			System.out.println(hashmap.get("dinesh"));
			
		}
		
	    // Streams 
		List<String> list = Arrays.asList("a","b","c","a");
		List<String> list2 = list.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		System.out.println(list2);
		
		
		List<String> list3 = list.stream().distinct().collect(Collectors.toList());
	    System.out.println(list3);	
	    
	    Integer[] intval = {1,2,3,4,5,6,7,8,9,10};
	    Arrays.stream(intval)
	    		.filter(x -> x%2 == 0 )
	    		.collect(Collectors.toList())
	    		.forEach(System.out::print);
	    		
	    Integer[] squ = {1,2,3,4,5,6};
	    Arrays.stream(squ)
	    	  .filter(x->x%2==0)
	    	  .map(x-> x*x)
	    	  .forEach(System.out::println);
	    
	    HashSet set = new HashSet();
	    set.add("dinesh");
	    set.add("sruthi");
	    set.add("dinesh");
	    
	    Iterator<String> it = set.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    
	    int[] arr = {1,2,3,4,5};
	    int ai = arr[0];
	    for(int i = 1;i<arr.length;i++) {
	    	if (ai<arr[i]) {
	    		ai = arr[i];
	    	}
	    }
	    
		System.out.println(ai);
		

	}

}
