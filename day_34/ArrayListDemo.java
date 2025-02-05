package day_34;

import java.util.*;

class ArrayListDemo {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
	    cityList.add("Delhi");
	    cityList.add("Mumbai");
	    cityList.add("Kolkata");
	    cityList.add("Hyderabad");
	    cityList.add("Bangalore");
	    cityList.add("Mumbai");
	    System.out.println("Original List- " + cityList);
	    cityList.remove(1);
	    cityList.remove("Mumbai");
	    System.out.println("List after removing elements- " + cityList);
	  }
}
