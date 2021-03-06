package application;
	

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Main9 extends Application {

	Label lbl = null;
	@Override
	public void start(Stage primaryStage) {
		try {
		
            Parent root = FXMLLoader.load(getClass().getResource("main10.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            Button btn = (Button) scene.lookup("#btn");
            lbl = (Label) scene.lookup("#lbl");
            
            btn.setOnMouseClicked(new EventHandler<Event>() {
            	
				@Override
				public void handle(Event event) {
					
					printLogger(lbl);
				}
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void printLogger(Label lbl) { 
		
		 new Thread(task).start();  // 스레드 실행. 
	}
	
	
	
	Task task = new Task<Void>() {              // task는 thread가 할 일 이라고 생각 하면 됨.
		 int cnt2 = 1;
	    @Override
	 
	    public void run() {   
	    	  
	    	// 여기서 원하는거 실행시키면 됨.
	    	
	    	try {
	    		
	    		for(int i = 1; i <= 9; i++) {
				Thread.sleep(1000);
				cnt2++;
				
				Platform.runLater(new Runnable() { 
					@Override public void run() { 
						

							lbl.setText(String.valueOf(cnt2));
							
						
					} 
					
				
					
				}); 
				
	    		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
			
	    		
	    } 
	    
	    @Override
	    protected Void call() throws Exception {    // 그냥 있어야 될듯 함.
	     return null;
	    	} // call FUC.
	   }; // Task.
	  

	

	

	
	
}







