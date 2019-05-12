
public class Printer {
	private int tonerLevel = 100;
	private int pages = 0;
	private boolean isDuplex;
	private int paper;
	
	public Printer(int tonerLevel, boolean isDuplex, int paper) {
		this.tonerLevel = tonerLevel;
		if(tonerLevel > 100) {
			this.tonerLevel = 100;
		}
		if(tonerLevel < 0) {
			this.tonerLevel = 0;
		}
		this.isDuplex = isDuplex;
		this.paper = paper;
		if(paper < 0) {
			this.paper = 0;
		}
	}
	
	public void fillToner() {
		System.out.println("Toner level is at " + tonerLevel + " percent.");
		if(tonerLevel < 100) {
			int toner = 100 - tonerLevel;
			System.out.println("Adding " + toner + " percent toner..");
			tonerLevel += toner;
			System.out.println("Toner level filled to 100 percent.");
		}
	}
	
	public void print(int toPrint) {
		if(isDuplex) {
			System.out.println("Printing on both sides.");
		}
		while(pages < toPrint) {
			if(paper == 0) {
				
				System.out.println("Printer out of paper.");
				break;
			}
			pages++;
			if(isDuplex) {
				if(pages % 2 == 0) {
					paper--;
				}
			} else {
				paper--;
			}
			System.out.println(pages + "/" + toPrint + " pages printed.");
		}
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPages() {
		return pages;
	}

	public boolean isDuplex() {
		return isDuplex;
	}
	
	

}
