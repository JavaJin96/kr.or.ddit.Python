package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Main6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main6.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            TextField me = (TextField) scene.lookup("#tfMine");
            TextField com = (TextField) scene.lookup("#tfCom");
            TextField res = (TextField) scene.lookup("#tfResult");
            Button btn = (Button) scene.lookup("#btn");
            
            
            me.setOnKeyPressed(new EventHandler<KeyEvent>() {
            	 
                @Override
                public void handle(KeyEvent event) {
                    if(event.getCode().equals(KeyCode.ENTER)) {
                    	int rnd = (int)(Math.random()*3) +1;
    					String comcon = "";
    					String result = "";
    					if(rnd == 1) {
    						comcon = "가위";
    					}else if(rnd == 2) {
    						comcon = "바위";
    					}else {
    						comcon = "보";
    					}
    					
    					String mecon = me.getText();
    					if(mecon.equals("가위")) {
    						if(comcon.equals("가위")) {
    							result =  "비겼습니다.";
    						}else if(comcon.equals("바위")) {
    							result = "졌습니다.";
    						}else {
    							result = "이겼습니다.";
    						}
    					}else if(mecon.equals("바위")) {
    						if(comcon.equals("바위")) {
    							result =  "비겼습니다.";
    						}else if(comcon.equals("보")) {
    							result = "졌습니다.";
    						}else {
    							result = "이겼습니다.";
    						}
    					}else {
    						if(comcon.equals("보")) {
    							result =  "비겼습니다.";
    						}else if(comcon.equals("가위")) {
    							result = "졌습니다.";
    						}else {
    							result = "이겼습니다.";
    						}
    					}
    					
    					
    					com.setText(comcon);
    					res.setText(result);
                    }
                }
            });
            
            btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					
					
				}
				
				
				
				
				
			});
            
            
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
