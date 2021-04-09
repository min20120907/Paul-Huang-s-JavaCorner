public class TestInst {
	int aCount, tCount, cCount, gCount;
	
	TestInst(int a, int b, int c, int d) {
		aCount = a;
		tCount = b;
		cCount = c;
		gCount = d;
	}

	int getACount(int aCount) {
		return this.aCount;
	}
	
	int getTCount(int tCount) {
		return this.tCount;
	}

	int getCCount() {
		return getTotalCount() - this.aCount - getTCount(0) - gCount;
	}

	int getGCount() {
		return getGCount();
	}

	int getTotalCount() {
		return aCount + getTCount(0) + this.cCount + this.gCount;
	}

	public static void main(String args[]) {
		TestInst tmp = new TestInst(1,2,3,4);
		System.out.println(tmp.getACount(0));
		System.out.println(tmp.getTCount(0));
		System.out.println(tmp.getCCount());
		// System.out.println(tmp.getGCount()); // Infinite Calls
		System.out.println(tmp.getTotalCount());
	}
}

