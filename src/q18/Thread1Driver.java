package q18;

import junit.framework.Test;

public class Thread1Driver {
	public static void main(String args[]){
	
	        //creating thread.
			Thread1 thrd = new Thread1();
	 
			//start the thread.
			thrd.start();
	 
			//again start the thread which is already started.
			//IllegalThreadStateException here.
			
			//thrd.start();
	}

}
