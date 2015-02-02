package pattern.facade.demo1;

public interface LetterProcess {

	public void writeContent(String content);
	
	public void fillEvelop(String address);
	
	public void letterIntoEvelop();
	
	public void sendLetter();
}
