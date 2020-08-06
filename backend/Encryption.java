
//time complexity O(n) n: length of String
public class Encryption {
	public String encrypt(String input){
		input= input.replaceAll(" ", "");
		int column= (int)Math.ceil(Math.sqrt(input.length()));
		int row= (int) Math.floor(Math.sqrt(input.length()));
		StringBuilder strBuilder= new StringBuilder();
		for(int i=0; i<column;i++) {
			int k=i;
			for(int j=0; j<=row; j++) {
				if(k<input.length()) {
				strBuilder.append(input.charAt(k));
				}
				k=k+ column;
			}
			strBuilder.append(" ");
		}
		return strBuilder.toString();
	}
}

		