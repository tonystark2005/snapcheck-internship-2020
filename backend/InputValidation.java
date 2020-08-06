
public class InputValidation {
	public boolean validate(String input) {
		if(input.length()<1 || input.length()>81) return false;
		input = input.replaceAll(" ", "");
		return input.matches("[a-z]+");
	}
	

}
