package q12;

public class Finally {
	
	public void calc(int num1, int num2) {
        try {
            int n = 125/5;
            System.out.println("Result: " + n);
        } catch (NullPointerException e) {
            System.out.println("Exception is thrown" + e);
        } finally {
            System.out.println("No exception");
        }
    }
	public static void main(String[] args) {
		Finally c = new Finally();
		c.calc(25, 0);
	}

}
