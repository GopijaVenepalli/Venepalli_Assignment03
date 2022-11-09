package q19;



public class Book implements Runnable {
	
	@Override
    public void run() {
        System.out.println("Title of book ");
        for (int rating = 1 ; rating <= 10; rating++) {
            System.out.println("Think like a monk " + rating);
        }
        
        System.out.println("*************************");
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Book r = new Book();
	        Thread t = new Thread(r);
	        t.start();
	        

		
	}

}
