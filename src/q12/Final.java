package q12;

public class Final {
	
	 public void values() {
	        int i1 = 10;
	        final int i2 = 20;
	        System.out.println("i1: " + i1);
	        System.out.println("i2: " + i2);
	        i1 = 20; // Will work
	        //i2 = 40; // Compilation error will occur because it is declared as final
	        System.out.println("i1: " + i1);
	        System.out.println("i2: " + i2);
	    }
	 
public static void main(String[] args) {
	
			Final v = new Final();
			v.values();
}

}
