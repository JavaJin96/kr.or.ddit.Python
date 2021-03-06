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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Main4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main4.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            TextField tf = (TextField) scene.lookup("#tf");
            TextArea ta = (TextArea) scene.lookup("#ta");
            Button btn = (Button) scene.lookup("#btn");
            
            btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					int num = Integer.parseInt(tf.getText());
					String res = "";
					for(int i = 1; i <= 9; i ++) {
						res += num + " X " + i + " = " + num*i + "\n";
					}
					
					ta.setText(res);
					
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
