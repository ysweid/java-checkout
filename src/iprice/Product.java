package iprice;

public class Product implements IPromo<Product> {
	String _id;
	
	// ... other attributes for product	
	
	public Product(String id) {
		_id = id;
	}

	@Override
	public Product applyPromo() {
		// Specific promo logic per product
		return this;
	}

}
