package q25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {
	
	public static void values(List<Integer>list){  
        if(!list.isEmpty()){  
           list.forEach(System.out::println);  
        }else{
       	System.out.println("Empty list"); 
        }
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forEach example
		Map<Integer, String> courses = new HashMap<Integer, String>();
    	courses.put(1, "WebApps");
    	courses.put(2, "Database Systems"); 
    	courses.put(3, "OOPS");  
    	courses.put(4, "Project Management");   
    	courses.put(5, "Advance Database Systems");   
    	courses.put(6, "GDP-1");
    	courses.put(7, "Patterns & Frameworks");
        //forEach to iterate and display each key and value pair    
    	courses.forEach((key,value)->System.out.println(key+" - "+value));
    	
    	//parallel array sorting example
    	int[] arr = {10,20,55,44,3,6};
    	//Iterating array elements
    	for (int i : arr) {
    	System.out.print(i+" ");
    	}
    	//Parallel sorting
    	Arrays.parallelSort(arr);
    	System.out.println("\nArray elements after sorting");
    	//Iterating array elements
    	for (int i : arr) {
    	System.out.print(i+" ");
    	}
    	
    	//stream api example
    	List<String> movies = new ArrayList<String>();
    	movies.add("The Avengers");
    	movies.add("Harry Potter");
    	movies.add("The rain");
    	//Using Stream and Lambda expression
    	long count = movies.stream().filter(str->str.length()<5).count();
        System.out.println("\n" + count+" strings with length less than 5");
            
            
        //interface example
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(100);  
        values(list1);  
        List<Integer> list2 = new ArrayList<>();   
        list2.add(500);
        list2.add(1000);
        values(list2);  
        //In Java 8, Compiler infers type of ArrayList
        values(new ArrayList<>()); 
       
	}

}
