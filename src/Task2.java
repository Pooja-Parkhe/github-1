
public class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+",i"+i+"current thread priority"+Thread.currentThread().getPriority());
		}
	}

	
	
}
