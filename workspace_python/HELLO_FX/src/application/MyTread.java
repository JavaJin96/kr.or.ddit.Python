package application;

public class MyTread {
	
	
	public static void showMunja() {
		for(int i = 1; i <= 100000; i++) {
			if(i%100 == 0) {
				System.out.print((char)i+"\n");
			}else {		
				System.out.print((char)i);				
			}
		}
	}
	
	public static void showNum() {
		for(int i = 1; i <= 100000; i++) {
			if(i%100 == 0) {
				System.out.print(i+"\n");
			}else {		
				System.out.print(i);				
			}
		}
	}
	
	public static void main(String[] args) {
		showNum();
		showMunja();
	}
}
