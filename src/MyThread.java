public class MyThread extends Thread {
	    public void run(){
	       System.out.println("MyThread running");
	       while(MAIN.threadloo==true) {
				MAIN.y++;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }
	  }