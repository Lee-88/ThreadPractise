//http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html
public class MAIN {
	static int x=0;
	static int y=0;
	static int z=0;
	static boolean mainloo = true;
	static boolean threadloo = true;
	static boolean threadloo2 = true;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("MainThread start");
		MyThread myThread = new MyThread();
		MyThread2 myThread2 = new MyThread2();
		myThread.start();
		myThread2.start();
		Thread.sleep(50);
		while(mainloo==true) {
			if (x>200) {mainloo = false;threadloo=false;} 
			 System.out.println("The increment++ counter for Y is "+ y + " and Z is "+z+"."+" While X is still "+x+".");x++;
			 Thread.sleep(200);
		}
	}
}
	 
