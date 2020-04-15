package composite;

public class Motherboard 
{
	private String model;
	private String bios;
	private int ramSlots;
	
	public Motherboard(String model, String bios, int ramSlots) {
		this.model = model;
		this.bios = bios;
		this.ramSlots = ramSlots;
	}

	public String getModel() {
		return model;
	}

	public String getBios() {
		return bios;
	}

	public int getRamSlots() {
		return ramSlots;
	}
	
	public void loadProgramme(String programName)
	{
		System.out.println("Program "+ programName + "is now loading");
	}
	
}
