package Password_Generator;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator  {

	public static void main(String[] args) {
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		String spl_char =" !#$%&()*+,-./:;<=>?@[]^_`{|}~";
		
		String Combination = upper+lower+num+spl_char;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tips... For Strong pasword enter minimun 10 char of \npassword length");
		System.out.print("Enter the Length of Password:- ");
		int len = sc.nextInt();
		char [] Password = new char[len];
		Random rn = new Random();
		for(int i=0;i<len;i++) {
			Password[i] = Combination.charAt(rn.nextInt(Combination.length()));
		}
		System.out.println("Generated Password is:- "+new String(Password));
		sc.close(); 
	}

}
