package my.designpatterns.crackingcoding.examples.builderpattern;

public class Order {
	private String sandWich;
	private String side;
	private String dessert;
	private String drink;
	public String getSandWich() {
		return sandWich;
	}
	public void setSandWich(String sandWich) {
		this.sandWich = sandWich;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	public Order(OrderBuilder builder){
		this.dessert = builder.dessert;
		this.drink = builder.dessert;
		this.sandWich = builder.sandWich;
		this.side = builder.side;
	}
	
	public static class OrderBuilder{
		private String sandWich;
		private String side;
		private String dessert;
		private String drink;
		
		public OrderBuilder(){
			
		}
		
		public OrderBuilder setSandWich(String sandWich) {
			this.sandWich = sandWich;
			return this;
		}
		public OrderBuilder setSide(String side) {
			this.side = side;
			return this;
		}
		public OrderBuilder setDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}
		public OrderBuilder setDrink(String drink) {
			this.drink = drink;
			return this;
		}
		
		public Order build(){
			return new Order(this);
		}
		
	}
}
