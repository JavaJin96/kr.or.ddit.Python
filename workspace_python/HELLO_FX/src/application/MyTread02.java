package application;

public class MyTread02 {
	
	
	public static void showMunja() {
		new Thread( new Runnable() {
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					if(i%100 == 0) {
						System.out.print((char)i+"\n");
					}else {		
						System.out.print((char)i);				
					}
				}
			}
		}).start();
	}
	
	public static void showNum() {
		new Thread( new Runnable() {
			public void run() {
				for(int i = 1; i <= 100000; i++) {
					if(i%100 == 0) {
						System.out.print(i+"\n");
					}else {		
						System.out.print(i);				
					}
				}
			}
		}).start();
	}
	
	public static void main(String[] args) {
		showNum();
		showMunja();
		
		
		
		
		
		
	}
}
