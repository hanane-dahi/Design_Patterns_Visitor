import java.text.DecimalFormat;

class TaxVisitor implements Visitor {
	
	DecimalFormat df = new DecimalFormat("#.##");
	public TaxVisitor() {
	}

	public double visit(Fruits fruitsItem) {
		System.out.println("Fruits Item: Price with Tax");
		return Double.parseDouble(df.format((fruitsItem.getPrice() * .18) + fruitsItem.getPrice()));
	}
		
	public double visit(Vegetables vegetablesItem) {
		System.out.println("Vegetables Item: Price with Tax");
		return Double.parseDouble(df.format((vegetablesItem .getPrice() * .32) + vegetablesItem.getPrice()));
	}
		
	public double visit(Clothes clothesItem) {
		System.out.println("Clothes Item: Price with Tax");
		return Double.parseDouble(df.format(clothesItem.getPrice()));
	}

}
