class Team {
	private String name;
	
	Team(String name) {
		this.name = name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	@Override	
	public String toString() {
		return this.name;
	}

}

public class Client {
	public static void main(String args[]) {
		Team t = new Team("java");
		System.out.println(t);
		t.setName("c++");
		System.out.println(t.getName());
	}
}

