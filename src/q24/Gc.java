package q24;

public class Gc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gc g = new Gc();
	    g = null;
	    System.gc();
	    // Runtime.getRuntime().gc();
	}
	   
	public void finalize() {
	      System.out.println("Garbage collected");
	}

	

}
