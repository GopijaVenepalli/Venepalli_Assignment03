package q19;

public class Books extends Thread {
	
	 @Override
	 public void run() {
	        System.out.println("Title of the book: ");
	        for (int rating = 1; rating <= 10; rating++) {
	            System.out.println("Think like a monk " + rating );
	        }
	        System.out.println("**************************");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books b=new Books();
		b.start();
	}

}
