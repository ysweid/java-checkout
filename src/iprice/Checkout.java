package iprice;

public class Checkout {
	Cart _cart;
	PaymentGateway _paymentGateway;
	
	// Receive the User and the preferred PaymentGateway to Checkout	
	public Checkout(User user, PaymentGateway paymentGateway) {
		// Get the cart of the given user		
		_cart = new Cart(user);
		_paymentGateway = paymentGateway;
	}
	
	public void Pay() {
		// Call ApplyPromo for Cart
		_cart = _cart.applyPromo();
		
		_paymentGateway.Pay(_cart);
	}
}
