public class VisitorTest {
	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Fruits banana = new Fruits(13);
		Vegetables carrots = new Vegetables(10);
		Clothes dress = new Clothes(30);
		
		System.out.println(banana.accept(taxCalc) + "\n");
		System.out.println(carrots.accept(taxCalc) + "\n");
		System.out.println(dress.accept(taxCalc) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES\n");

		System.out.println(banana.accept(taxHolidayCalc) + "\n");
		System.out.println(carrots.accept(taxHolidayCalc) + "\n");
		System.out.println(dress.accept(taxHolidayCalc) + "\n");

	}
}