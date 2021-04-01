public class DNASynth {
	int aCount, cCount, tCount, gCount;

	DNASynth(int a, int tCount, int c, int g) {
		tCount = tCount;
	}
	int setCCount(int c){
		return c;
	}
	void setGCount(int gCount) {
		this.gCount = gCount;
	}
	public static void main(String args[]) {
		DNASynth d = new DNASynth(1,2,3,4);
		System.out.println(d.tCount);
	}
}


