package encapsulation;

public class Printer 
{
	private int tonerLevel;
	private int pagePrinted;
	private boolean duplexPrint;

	public Printer(int tonerLevel,  boolean duplexPrint) {
		if(this.tonerLevel > -1 && tonerLevel <=100)
		{
			this.tonerLevel = tonerLevel;
		}
		else
		{
			this.tonerLevel = -1;
		}

		this.duplexPrint = duplexPrint;
		this.pagePrinted = 0;
	}

	public int fillToner(int addToner)
	{
		if(addToner >0 && addToner <=100)
		{
			if((tonerLevel + addToner) > 100)
			{
				return -1;
			}
			this.tonerLevel += addToner;
			return tonerLevel;
		}
		
		else
		{
			return -1;
		}
	}

	public int pagePrinting(int pages)
	{
		int pagesToPrint = (pages / 2) + (pages % 2);
		if(this.duplexPrint)
		{
			pagesToPrint /= 2;
			System.out.println("Printing in duplex mode");
		}
		this.pagePrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagePrinted() {
		return pagePrinted;
	}

	
}
