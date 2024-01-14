import java.util.*;
public class Mini_Project 
{
		public static String encrypt(String plaintext) {    //encryption
		int k1=7;
		int k2=2;
		char[] cText = new char[plaintext.length()]; // cTest=cipher text
		for (int i = 0; i < plaintext.length(); i++) {
			char ch = plaintext.charAt(i);
		    if (Character.isUpperCase(ch)) 
		    {
		    	int p = plaintext.charAt(i) - 'A';
		        int c = (p * k1 + k2) % 26;
		        cText[i] = (char) (c + 'A'); // adding a/A again to get back the original value
		    } 
		    else 
		    {
		    	int p = plaintext.charAt(i) - 'a';
		        int c = (p * k1 + k2) % 26;
		        cText[i] = (char) (c + 'a');
		    }
		}
		return new String(cText);
	
		}
		public static String decrypt(String chipertext) { //decryption
			int k1=7;
			int k2=2;
			char[] pText = new char[chipertext.length()];
		    int k1_inv = 0;
		    for (int i = 0; i < 26; i++) {
		    	if ((k1 * i) % 26 == 1) {
		    		k1_inv = i;
		    		break;
		    	}
		    }
		    for (int i = 0; i < chipertext.length(); i++) {
		    	char ch = chipertext.charAt(i);
		        if (Character.isUpperCase(ch)) {
		        	int p = chipertext.charAt(i) - 'A';
		            int c = ((p - k2 + 26) * k1_inv) % 26; // adding 26 brings back to the org ASCII
		            pText[i] = (char) (c + 'A'); // adding a/A again to get back the original value
		            }
		        else 
		        {
		        	int p = chipertext.charAt(i) - 'a';
		            int c = ((p - k2 + 26) * k1_inv) % 26;
		            pText[i] = (char) (c + 'a');
		            
		            }
		        }
		        return new String(pText);
		    }
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter plain text below(only text without special character or digit):");
		    String plain = sc.nextLine();
		    String cipher = encrypt(plain);
		    String decrypted = decrypt(cipher);
		    System.out.println("Ciphertext: " + cipher);
		    System.out.println("Decrypted text: " + decrypted);
		    
		    }
	}


