package composite;

public class Main {

	public static void main(String[] args) 
	{
		Dimension dimension = new Dimension(20,20,5);
		CAse theCase = new CAse("Dell", "2102", dimension);
		
//		Resolution resolution = new Resolution(1082, 980);
		Monitor themonitor = new Monitor("27Inch Beast", "Acer", 27, new Resolution(1082, 980));

		Motherboard themontherboard = new Motherboard("mobo", "Asus", 6);
		
		PC thePC = new PC(theCase, themonitor, themontherboard);
		
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		
	}

}
