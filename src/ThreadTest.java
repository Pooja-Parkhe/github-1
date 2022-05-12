
public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}

	public static void main(String[] args) {
		System.out.println("start");
		
		for (int i=0;i<=10;i++) {
			
			System.out.println("main"+i);
		}
		
		ThreadTest n=new ThreadTest();
		n.start();
		
		System.out.println("end");
		
	}
	
	void display() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("display"+i);
		}
	}
	
	
}
