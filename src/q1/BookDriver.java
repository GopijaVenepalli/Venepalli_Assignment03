package q1;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book<String> b= new Book<>("Outliers");
		System.out.println("Name of the book: " + b.getBook());
		
		Book<Integer> b1= new Book<>(111);
		System.out.println("Number of the books sold: " + b1.getBook());
		
		Book<Double> b2= new Book<>(21.50);
		System.out.println("Cost of the book: " + b2.getBook());
	}

}
