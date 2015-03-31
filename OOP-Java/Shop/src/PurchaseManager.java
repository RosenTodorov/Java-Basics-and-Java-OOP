
public final class PurchaseManager {
	
	public static void ProcessPurchase (Customer customer, Product product) {
		if (product instanceof FoodProduct) {
			if (((FoodProduct) product).isExpired()) {
				System.out.println("This product has expired");
			}
		}
		
		if (product.getQuantity() < 1) {
			System.out.println("The product is out of stock!");
		}else if ((product instanceof Expirable) 
				&& (((FoodProduct) product).isExpired())) {
			System.out.println("The product is expirated!");
		}else if (customer.getBalance().compareTo(product.getPrice()) == -1){
			System.out.println("You do not have enough money to buy this product!");
		}else if((product.getAgeRestrictionLevel()==AgeRestriction.Adult) 
				&& (customer.getAge()<18)){
			System.out.println("You are too young to buy this product!");
		}else{
			System.out.println("Other!");
		}		
	}
}
