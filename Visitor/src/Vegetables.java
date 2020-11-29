class Vegetables implements Visitable {
	
	private double price;

	Vegetables(double item) {
		price = item;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}
	
}