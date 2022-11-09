package q23;

public class Cricketers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sachin Tendulkar";  
		String s1 = s.concat("-batsman");  
		System.out.println(s1); 
				
		Thread t1 = new Thread(new Runnable() {
					
			@Override
		    public void run() {
						s1.concat("t1");
						System.out.println("Thread1 : "+s1);
			}
	    });
				
		Thread t2 = new Thread(new Runnable() {
					
			@Override
			public void run() {
						s1.concat("t2");
						System.out.println("Thread2 : "+s1);
			}
		});
		
		t1.start();
		t2.start();
	
	}

		

	

}
