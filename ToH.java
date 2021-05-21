import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;
public class ToH {
	static ThreadPoolExecutor executor =   (ThreadPoolExecutor) Executors.newFixedThreadPool(32);
	static enum Pole {A,B,C}
	static void hanoiTower(int n, Pole from, Pole mid, Pole to){
		if(n==1) {System.out.println("Disk 1 from "+from+" to "+to);return;}
		executor.submit( () -> {hanoiTower(n-1, from, to, mid);});
		System.out.println("Disk "+n+" from "+from+" to "+to);
		executor.submit(()->{hanoiTower(n-1, mid, from, to);});
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		hanoiTower(s.nextInt(), Pole.A, Pole.B, Pole.C);
            System.gc();
	}
}

