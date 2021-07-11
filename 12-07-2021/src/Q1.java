class Shoes{
	int price;
	String color;
	void getPrice(int price){
		this.price = price;
		System.out.println("Price of these shoes is " + this.price);
	}
}
class Nike extends Shoes{
	void getPrice(int price) {
		this.price = price*2;
		System.out.println("Price of these shoes is " + this.price);
	}
	void getPrice(int price, int tax) {
		this.price = price + tax;
		System.out.println("Price of these shoes is " + this.price);
	}
	void getPrice(int price, int tax, int negotiation) {
		this.price = price + tax - negotiation;
		System.out.println("Price of these shoes is " + this.price);
	}
}
public class Q1 {

	public static void main(String[] args) {
		Shoes s1 = new Shoes();
		Nike n1 = new Nike();
		s1.getPrice(10);
//		method overriding example as in the below line of code, method of subclass would be called. Runtime polymorphism
		n1.getPrice(10);    
//		method overloading as it is compile time polymorphism, getPrice method would look at the parameters provided and then proceed to method invoking within the same class
		n1.getPrice(10, 20);
		n1.getPrice(10, 20, 15);
	}

}
