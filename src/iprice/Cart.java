package iprice;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IPromo<Cart> {
	User _user;
	private List<Product> _products;
	// ... other Cart attributes
	
	// Initialise Cart with the products read from data store by User 
	public Cart(User user) {
		_user = user;
		// Should get prdoucts from data store by User		
		_products = new ArrayList<Product>();
	}
	
	// Initialise Cart with provided products	
	public Cart(User user, List<Product> products) {
		_user = user;
		_products = products;
	}
		
	// ... more methods related to Cart can be implemented add, remove, count..etc

	@Override
	public Cart applyPromo() {
		// Apply promo logic on whole Cart
		//  e.g RM20 off if the shopping cart contains jeans and smartphones
		//
		// OR
		//
		// Loop over products and call applyPromo for each product
		// since product implement IPromo		
		for (int i = 0; i < _products.size(); i++) {
			Product product = _products.get(i);
			_products.set(i, product.applyPromo()); 
		}

		// return Cart instance after promo is applied		
		return this;
	}

}
