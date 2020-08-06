

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryption encr= new Encryption();
//		String str="dmghuiothrthjh";
		String g= "chillout";
		String s="if man was meant to stay on the ground god would have given us roots";
		InputValidation validate= new InputValidation();
		if(!validate.validate(g)) JOptionPane.showMessageDialog(null, "Invalid input");
		else{
			System.out.println(encr.encrypt(g));
			String output= encr.encrypt(s);
			System.out.println(output);
	}

}
}
