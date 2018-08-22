
public class Multithreading extends Thread{
	
	public void run() {
		System.out.println("my thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading obj = new Multithreading();
		obj.start();
		

	}

}
