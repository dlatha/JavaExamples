package my.designpatterns.crackingcoding.examples.builderpattern;

public class PlaceOrder {

	public static void main(String[] args) {
		
		Order newOrder = new Order.OrderBuilder().setDessert("cake").setDrink("coke").setSandWich("bacon").setSide("fries").build();
		System.out.println(newOrder.getDessert());
		System.out.println(newOrder.getDrink());
		System.out.println(newOrder.getSandWich());
		System.out.println(newOrder.getSide());

	}

}
