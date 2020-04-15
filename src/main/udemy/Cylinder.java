package main.udemy;

public class Cylinder
{

	private double height;

	public Cylinder(double radius, double height) {
//		super(radius);
		this.height=height;
		if(height<0)
        {
            height=0;
        }
	}

	public double getHeight() {
		return height;
	}
//    public double getVolume()
//    {
//        return (getRadius()*getRadius()*Math.PI * height);
//    }
}
