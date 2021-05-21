import java.util.Scanner;
public class Division{
		static boolean noSol = true;
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		while(true){
		int tgt = s.nextInt();
		if(tgt==0) break;
		int ii=0,jj=0;
		for(int i=1234;i<99999;i++){
				Thread t = new Thread(new MyRunnable(i,tgt));
				t.start();
		}
		if(noSol)
			System.out.println("There are no solutions for "+tgt);
		}
	}
	public static void setNoSol(boolean b){
		Division.noSol = b;
	}
}
class MyRunnable implements Runnable{
	int i,tgt;
	MyRunnable(int i, int tgt){
	this.i=i; this.tgt = tgt;
	}
	public void run() {

			for(int j=1234;j<99999;j++){
				if((double)(j/i)==tgt && j%i==0) {
					String str = String.format("%05d%05d",j,i);
					if(
						str.indexOf("1") !=-1&&
						str.indexOf("2") !=-1&&
						str.indexOf("3")  !=-1&&
						str.indexOf("4") !=-1 &&
						str.indexOf("5") !=-1 &&
						str.indexOf("6") !=-1 &&
						str.indexOf("7") !=-1 &&
						str.indexOf("8") !=-1 &&
						str.indexOf("9") !=-1 &&
						str.indexOf("0") !=-1 
						){
						Division.setNoSol(false);
					System.out.printf("%05d / %05d = %d\n",j,i,tgt);}
				}
			}
	}
}
