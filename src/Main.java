
public class Main {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+"  start");
		
		Task1 task1= new Task1();
		Thread t1=new Thread(task1);
		t1.setName("User Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		t1.interrupt();
		
		Task2 task2=new Task2();
		Thread t2=new Thread(task2);
		t2.setDaemon(true);
		t2.setName("Daemon");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+"  completed");
		
	}
}
