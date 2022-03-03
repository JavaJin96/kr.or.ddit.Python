package application;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Main10 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main9.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            Button btn = (Button) scene.lookup("#btn");
            TextField tf1 = (TextField) scene.lookup("#tf1");
            TextField tf2 = (TextField) scene.lookup("#tf2");
            TextArea ta =  (TextArea) scene.lookup("#ta");
            
            btn.setOnMouseClicked(new EventHandler<Event>() {
            	
				@Override
				public void handle(Event event) {
					int num1 = Integer.parseInt(tf1.getText());
					int num2 = Integer.parseInt(tf2.getText());
					String res = "";
					for(int i = num1; i <= num2; i++) {
						//res += mystar(i);
						for(int j = 0; j < i; j++) {
							res += "*";
						}
						res += "\n";
						
					}
					ta.setText(res);
					
					
				}
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String mystar(int cnt) {
		String ret = "";
		for(int i = 0; i < cnt; i++) {
			ret += "*";
		}
		ret += "\n";
		return ret;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
