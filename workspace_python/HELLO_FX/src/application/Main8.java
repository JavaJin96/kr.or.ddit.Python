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
import javafx.scene.control.TextField;


public class Main8 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main8.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            Button btn = (Button) scene.lookup("#btn");
            Label lbl1 = (Label) scene.lookup("#lbl1");
            Label lbl2 = (Label) scene.lookup("#lbl2");
            Label lbl3 = (Label) scene.lookup("#lbl3");
            Label lbl4 = (Label) scene.lookup("#lbl4");
            Label lbl5 = (Label) scene.lookup("#lbl5");
            Label lbl6 = (Label) scene.lookup("#lbl6");
            
            btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					List<Integer> list = new ArrayList<>();
					List<Integer> res = new ArrayList<>();
					
					for(int i = 1; i <= 45; i++) {
						list.add(i);
					}
					
					Collections.shuffle(list);
					
					for(int i = 0; i < 6; i++) {
						res.add(list.get(i));
					}
					
					Collections.sort(res);
					
					
					lbl1.setText(String.valueOf(res.get(0)));
					lbl2.setText(String.valueOf(res.get(1)));
					lbl3.setText(String.valueOf(res.get(2)));
					lbl4.setText(String.valueOf(res.get(3)));
					lbl5.setText(String.valueOf(res.get(4)));
					lbl6.setText(String.valueOf(res.get(5)));
					
					
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
