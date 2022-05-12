
public class Task1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++) {
			
//			try {
//				Thread.sleep(500l);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				break;
//			}
			
			System.out.println(Thread.currentThread().getName()+",i:"+i+"current thread priority"+Thread.currentThread().getPriority());

           if(Thread.currentThread().isInterrupted()) {
        	   System.out.println("interrupted");
        	   break;
           }		
		}
	}

	
	
	
}
