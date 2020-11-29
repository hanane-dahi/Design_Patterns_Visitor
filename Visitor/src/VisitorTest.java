public class VisitorTest {
	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Fruits banana = new Fruits(3.47);
		Vegetables carrots = new Vegetables(11.99);
		Clothes dress = new Clothes(19.99);
		
		System.out.println(banana.accept(taxCalc) + "\n");
		System.out.println(carrots.accept(taxCalc) + "\n");
		System.out.println(dress.accept(taxCalc) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES\n");

		System.out.println(banana.accept(taxHolidayCalc) + "\n");
		System.out.println(carrots.accept(taxHolidayCalc) + "\n");
		System.out.println(dress.accept(taxHolidayCalc) + "\n");

	}
}