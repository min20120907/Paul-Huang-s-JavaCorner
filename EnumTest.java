public class TestEnum {
		enum Test{
			A(200), B(100), C(300);
			int v;
			private Test(int v){
				this.v = v;
			}
			public toString(){
				return "v="+v;
			}
			private static String getFirstLetter() {
				return A.toString();
			}
		}
	public static void main(String args[]) {
		Test a = new Test();
		System.out.println(Test.getFirstLetter());
	}
}
