package ProductSync;

public class Company {

	int n ; 
	
//	public Company(int n) {
//		super();
//		this.n = n;
//	}
	
	 public void produce_item( int n) {
		this.n = n;
		System.out.println("produces" + n);
	}
	
	 public void consume_item() {
		
		System.out.println("consume" + this.n);
		
	}
}
