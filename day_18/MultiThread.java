package day_18;

public class MultiThread implements Runnable {
	public void show() {
		System.out.println("Show() method");
	}
	@Override
	public void run() {
//		show();
		for(int i=1;i<=5;i++) {
//			System.out.println(i);
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		

	}

	public static void main(String[] args) {
		System.out.println("main method starting");
		MultiThread obj = new MultiThread();
		Thread t1=new Thread(obj); //obj becomes a thread object
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Back to main");
		

	}

}
