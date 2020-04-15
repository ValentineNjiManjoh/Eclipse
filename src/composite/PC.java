package composite;

public class PC 
{
	private CAse theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(CAse theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public CAse getTheCase() {
		return theCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
}
