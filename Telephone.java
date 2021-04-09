import java.util.Scanner;

public class Telephone {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.next();

		String Phone[] = {
			"ABC","DEF","GHI",
			"JKL","MNO","PQRS",
			"TUV","WXYZ"};
		int len = 0;
		String p_num="";
		int alphas = 0, hyphens=0;
		while(len < input.length()){
			int num=2;
			boolean weird = false;
			for(String a : Phone){
				if(a.contains(""+input.charAt(len)))
					break;
				num++;
			}
			if(num>9) weird = true;
			if(input.charAt(len)!='-' && !weird){
				p_num+=String.valueOf(num);
				alphas++;
			}else{
				p_num+=input.charAt(len);
			}if(input.charAt(len)=='-'){
				hyphens++;
			}
			len++;
		}
		System.out.println(p_num+" "+alphas+" "+hyphens);
		
	}
}
