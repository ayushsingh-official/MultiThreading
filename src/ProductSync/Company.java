package ProductSync;

public class Company {

	String n ; 
	
	Producer producer;
	
	Consumer consumer;
	
	public Company(String n) {
		super();
		this.n = n;
	}
	
	public void produce_item(Producer producer , String n) {
		this.n = n;
		System.out.println(producer + "produces" + n);
	}
	
	public void consume_item(Consumer consumer , String n) {
		this.n = n;
		System.out.println(consumer + "consumer" + n);
	}
}
