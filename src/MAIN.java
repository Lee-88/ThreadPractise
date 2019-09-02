//http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html
public class MAIN {
	static int x=0;
	static int y=0;
	static int z=0;
	static boolean mainloo = true;
	static boolean threadloo = true;
	static boolean threadloo2 = true;
	public static void main(String[] args) {
		System.out.println("This is the main function");
		MyThread myThread = new MyThread();
		MyThread2 myThread2 = new MyThread2();
		  myThread.start();
		  myThread2.start();
		while(mainloo==true) {
			if (x>200) {mainloo = false;threadloo=false;}
			System.out.println("The increment++ counter for Y is "+ y + " and Z is "+z+"."+" While X is still "+x+".");x++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	 
