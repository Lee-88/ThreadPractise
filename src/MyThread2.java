public class MyThread2 extends Thread {
	    public void run(){
	       System.out.println("MyThread running");
	       while(MAIN.threadloo2==true) {
				MAIN.z++;
				try {
					Thread.sleep(45);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
	  }