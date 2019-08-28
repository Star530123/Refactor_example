
public class User {
	private PizzaStore pizzaStore = new PizzaStore();
	
	public NYPizza orderNYPizza() {
		return pizzaStore.createNYPizza();
	}
	
	public ChicagoPizza orderChicagoPizza() {
		return pizzaStore.createChicagoPizza();
	}
	
	public CheesePizza orderCheesePizza() {
		return pizzaStore.createCheesePizza();
	}
}
