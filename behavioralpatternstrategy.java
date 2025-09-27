package exercise1;

interface PaymentStrategy {
	 void pay(int amount);
	}

	//Concrete Strategy 1
	class CreditCardPayment implements PaymentStrategy {
	 @Override
	 public void pay(int amount) {
	     System.out.println("Paid " + amount + " using Credit Card.");
	 }
	}

	//Concrete Strategy 2
	class UpiPayment implements PaymentStrategy {
	 @Override
	 public void pay(int amount) {
	     System.out.println("Paid " + amount + " using UPI.");
	 }
	}

	//Context class
	class ShoppingCart {
	 private PaymentStrategy paymentStrategy;

	 // Constructor injection of strategy
	 public ShoppingCart(PaymentStrategy strategy) {
	     this.paymentStrategy = strategy;
	 }

	 // Execute payment using chosen strategy
	 public void checkout(int amount) {
	     paymentStrategy.pay(amount);
	 }
	}

	//Driver class with main method
	public class behavioralpatternstrategy {
	 public static void main(String[] args) {
	     // Using Credit Card strategy
	     ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
	     cart1.checkout(1000);

	     // Switching to UPI strategy
	     ShoppingCart cart2 = new ShoppingCart(new UpiPayment());
	     cart2.checkout(500);
	 }
	}
