package pattern.facade.demo1;

public class Customer {

	public static void main(String[] args) {
		PostOffice postOffice = new PostOffice();
		postOffice.sendLetter("Darling Street", "Hi, I am coming...");
	}

}
