
public class RunnableTest implements Runnable{

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
		RunnableTest r=new RunnableTest(); 
		
		Thread n=new Thread(r);
		n.start();
		
		System.out.println("end");
		
	}
	
	void display() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("display"+i);
		}
	}
	
	
}
