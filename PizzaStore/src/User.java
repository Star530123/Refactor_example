
public class User {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza nypizza = new NYPizza();
		@SuppressWarnings("unused")
		NYPizza bakedPizza = (NYPizza) pizzaStore.order(nypizza);
//		System.out.println(bakedPizza);
	}
}
