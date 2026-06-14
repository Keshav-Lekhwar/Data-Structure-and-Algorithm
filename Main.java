import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		int n = sc.nextInt();

		if(n<0){
			System.out.println("INVALID INPUT");
		}

		String result="";

		for(int i=0; i<str.length(); i++){

			char ch = str.charAt(i);
			
			if(Character.isLetter(ch)){
				
				if((int)ch>=97 && (int)ch<=122){

					
				char c1 =	(char) (ch-97+n);

				result += (char)((c1%26)+97);

				}

				if((int)ch>=65 && (int)ch<=90){

					char c2 = (char) (ch-65+n);
					result += (char)((c2%26)+65);

				}

			}

			else if(Character.isDigit(ch)){
				 
				 result += Integer.parseInt(ch+"")+n;
			}

			
			
		}


		System.out.println(result);

	}
}