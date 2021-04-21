class Resource {
	public Worker owner;
	public synchronized boolean claim(Worker worker) {
		if(owner == null){
			owner = worker;
			return true;
		}
		else return false;
	}
	public synchronized void release() {
		owner = null;
	}
}

class Worker {
	public synchronized void work(Resource... resources) {
		for(int i =0;i<10;i++){
			while(!resources[0].claim(this)){}
			while(!resources[1].claim(this)){}
			resources[1].release();
			resources[0].release();
			System.out.println("task completed"+i);
		}
	}
}

public class ResWorker {
	public static void main(String args[]) {
		Worker w1 = new Worker();
		Worker w2 = new Worker();

		Resource r1 = new Resource();
		Resource r2 = new Resource();

		new Thread(()->{w1.work(r1,r2);System.out.println("Thread 1 Finished");}).start();
		new Thread(()->{w2.work(r2,r1);System.out.println("Thread 2 Finished");}).start();
	}
}

