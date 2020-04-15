package composite;

public class CAse {
	private String model;
	private String powerSuppy;
	private Dimension dimension;
	
	public CAse(String model, String powerSuppy, Dimension dimension) {
		this.model = model;
		this.powerSuppy = powerSuppy;
		this.dimension = dimension;
	}
	
	public void pressPowerButton()
	{
		System.out.println("Power utton pressed");
	}

	public String getModel() {
		return model;
	}

	public String getPowerSuppy() {
		return powerSuppy;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	

}
