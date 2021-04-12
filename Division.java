import java.util.Scanner;
public class Division {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		while(true){
		int tgt = s.nextInt();
		if(tgt==0) break;
		int ii=0,jj=0;
		for(int i=1000;i<99999;i++){
			for(int j=1000;j<99999;j++){
				if((double)(j/i)==tgt) {
					System.out.printf("%05d / %05d = %d\n",j,i,tgt);
				}
			}
		}
			System.out.println("no result for"+tgt);
		}
	}
}

