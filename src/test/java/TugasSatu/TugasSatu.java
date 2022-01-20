package TugasSatu;


import java.util.HashMap;
import java.util.TreeMap;


public class TugasSatu {
//membuat hashpMap dan treeMap 
	
	public static void main(String[] args) {
		
//	mambuat object hashmap
		 HashMap<Integer, String> days = new HashMap<Integer,String>();
	        
	        // mengisi nilai ke objek days
	        days.put(1, "Minggu");
	        days.put(2, "Senin");
	        days.put(3, "Selasa");
	        days.put(4, "Rabu");
	        days.put(5, "Kamis");
	        days.put(6, "Jum'at");
	        days.put(7, "Sabtu");
	        
	        // mencetak semua isi dari objek days
	        System.out.println("Isi objek days: " + days);
	        // mengambil hari senin
	        System.out.println("Hari kedua: " + days.get(2));
	    
//	membuat object treemap
	     TreeMap<String, Integer> numbers = new TreeMap<>();
	     
	        numbers.put("One", 1);
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        System.out.println("TreeMap: " + numbers);

	        // Using get()
	        int value1 = numbers.get("Three");
	        System.out.println("Using get(): " + value1);

	        // Using getOrDefault()
	        int value2 = numbers.getOrDefault("Five", 5);
	        System.out.println("Using getOrDefault(): " + value2);
	}

}
