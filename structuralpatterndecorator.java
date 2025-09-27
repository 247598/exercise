package exercise1;

//public class structuralpatterndecorator {
//
//	public structuralpatterndecorator() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

interface Coffee {
	 String getDescription();
	 double getCost();
	}

	//Concrete Component
	class SimpleCoffee implements Coffee {
	 @Override
	 public String getDescription() {
	     return "Simple Coffee";
	 }

	 @Override
	 public double getCost() {
	     return 5.0;
	 }
	}

	//Decorator
	class MilkDecorator implements Coffee {
	 private Coffee coffee;

	 public MilkDecorator(Coffee coffee) {
	     this.coffee = coffee;
	 }

	 @Override
	 public String getDescription() {
	     return coffee.getDescription() + ", Milk";
	 }

	 @Override
	 public double getCost() {
	     return coffee.getCost() + 2.0;
	 }
	}

	//Driver class with main method
	public class structuralpatterndecorator {
	 public static void main(String[] args) {
	     Coffee baseCoffee = new SimpleCoffee();
	     System.out.println(baseCoffee.getDescription() + " costs $" + baseCoffee.getCost());

	     Coffee milkCoffee = new MilkDecorator(baseCoffee);
	     System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.getCost());
	 }
	}
