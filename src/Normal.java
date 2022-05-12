
public class Normal {

	public static void main(String[] args) {
		System.out.println("start");
		
		for (int i=0;i<=10;i++) {
			
			System.out.println("main"+i);
		}
		
		Normal n=new Normal();
		n.display();
		
		System.out.println("end");
		
	}
	
	void display() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("display"+i);
		}
	}
}
