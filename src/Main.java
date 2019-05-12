
public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(78, false, 10);
		
		printer.fillToner();
		System.out.println();
		printer.print(10);
	}

}
