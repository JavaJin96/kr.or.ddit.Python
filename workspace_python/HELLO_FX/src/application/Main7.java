package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;


public class Main7 extends Application {
	String phnum = "";
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main7.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            Button btn1 = (Button) scene.lookup("#btn1");
            Button btn2 = (Button) scene.lookup("#btn2");
            Button btn3 = (Button) scene.lookup("#btn3");
            Button btn4 = (Button) scene.lookup("#btn4");
            Button btn5 = (Button) scene.lookup("#btn5");
            Button btn6 = (Button) scene.lookup("#btn6");
            Button btn7 = (Button) scene.lookup("#btn7");
            Button btn8 = (Button) scene.lookup("#btn8");
            Button btn9 = (Button) scene.lookup("#btn9");
            Button btn10 = (Button) scene.lookup("#btn10");
            Button Call = (Button) scene.lookup("#btnCall");
            TextField tf = (TextField) scene.lookup("#tf");
            
           
            
            
            btn1.setOnMouseClicked(new EventHandler<Event>() {
            	
				@Override
				public void handle(Event event) {
					phnum += btn1.getText();
					tf.setText(phnum);
				}
			});
            btn2.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn2.getText();
            		tf.setText(phnum);
            	}
            });
            btn3.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn3.getText();
            		tf.setText(phnum);
            	}
            });
            btn4.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn4.getText();
            		tf.setText(phnum);
            	}
            });
            btn5.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn5.getText();
            		tf.setText(phnum);
            	}
            });
            btn6.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn6.getText();
            		tf.setText(phnum);
            	}
            });
            btn7.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn7.getText();
            		tf.setText(phnum);
            	}
            });
            btn8.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn8.getText();
            		tf.setText(phnum);
            	}
            });
            btn9.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn9.getText();
            		tf.setText(phnum);
            	}
            });
            btn10.setOnMouseClicked(new EventHandler<Event>() {
            	@Override
            	public void handle(Event event) {
            		phnum += btn10.getText();
            		tf.setText(phnum);
            	}
            });

            
            
            
            
            
            
            
            Call.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("Call~");
					alert.setHeaderText(phnum);
					alert.setContentText("???????????????...");

					alert.showAndWait();



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
