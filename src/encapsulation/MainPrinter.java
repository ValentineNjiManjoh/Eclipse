package encapsulation;

public class MainPrinter {

	public static void main(String[] args) 
	{
		
		
		Printer printer = new Printer(50, false);
		System.out.println("Inital pages count =" + printer.getPagePrinted());
		

		int pagesPrinted = printer.pagePrinting(4);
		System.out.println("Page printed was "+ pagesPrinted + "new total print count for printer = " + printer.getPagePrinted());

	}

}
