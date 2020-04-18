package iprice;

public abstract class PaymentGateway {
	
	abstract protected void Pay(Cart cart);
	
	abstract protected String PaymentMethod();
	
	//	... implement non-abstract shared methods among all payment gateways

}
