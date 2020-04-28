package PizzaOrderingSystem;

public class Application {
	public static void main(String[] args){
		
		PizzaOrderBuilder orderBuilder = new PizzaOrderBuilder();
		
		orderBuilder.setMeat("Chicken");
		orderBuilder.setCheese();
		orderBuilder.setSize("Large");
		orderBuilder.spiceLavel(8);
		
		System.out.println(orderBuilder.getOrder().toString());
		
		
	}
}
