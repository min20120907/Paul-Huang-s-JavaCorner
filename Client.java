class Team {
        private String name;
        Team(String name) {
                this.name = name ;
        }       
        void setName(String name) {
                this.name = name;
        }       
        String getName() {
                return this.name;
        }       
        @Override
        public String toString() {
                return this.name;
        }       
        
        @Override
        public boolean equals(Object o) {
                if(this==o) return true;
                if(this.getClass()==o.getClass()) return true;
                return ((Team) o).getName().equals(this.getName());
        }
}      
public class Client {
	public static void main(String args[]) {
		Team t = new Team("java");
		Team t1 = new Team("java");
		System.out.println(t);
		t.setName("c++");
		System.out.println(t.getName());
		System.out.println(t.equals(t1));
	}
}

