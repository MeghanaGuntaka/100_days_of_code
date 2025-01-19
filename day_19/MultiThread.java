package day_19;

public class MultiThread extends Thread
{
	void show() {
		System.out.println("Show()");
	}
	public void run() {
		System.out.println("run()");
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
//			System.out.println(i);
			try {
				System.out.println("Sleep time: 2sec");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public static void main(String[] args) throws InterruptedException {
		MultiThread obj = new MultiThread(); //obj is also a Thread object
		MultiThread obj1 = new MultiThread();
		System.out.println("Main Method Starts");
		System.out.println(obj.getName());
		obj.start(); //This invokes the run() method
		obj.join();
		obj.show();
		obj1.start();
//		obj1.join();
		System.out.println("Back to Main method"); 

	}
	

}
