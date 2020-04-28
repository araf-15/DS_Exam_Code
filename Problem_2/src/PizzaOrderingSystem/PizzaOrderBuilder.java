package PizzaOrderingSystem;

public class PizzaOrderBuilder {
	
	private PizzaOrder order;
	
	public PizzaOrderBuilder(){
		order = new PizzaOrder();
	}
	
	public boolean setCheese(){
		order.useChese = true;
		return order.useChese;
	}
	
	public int spiceLavel(int lavel){
		order.spiceLavel = lavel;
		return order.spiceLavel;
	}
	
	public void setMeat(String meatType){
		order.meat = meatType;
	}
	
	public void setSize(String size){
		order.size = size;
	}
	
	public PizzaOrder getOrder(){
		return order;
	}
}
