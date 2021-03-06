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


public class Main3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
            Parent root = FXMLLoader.load(getClass().getResource("main3.fxml"));
            Scene scene = new Scene(root,600,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();

            Button btn = (Button) scene.lookup("#btn");
            TextField tfm = (TextField) scene.lookup("#tf_mine");
            TextField tfc = (TextField) scene.lookup("#tf_com");
            TextField tfr = (TextField) scene.lookup("#tf_result");
            TextField cnt2 = (TextField) scene.lookup("#cnt");
            
         
            btn.setOnMouseClicked(new EventHandler<Event> () {
            	   int cnt = 0;
				@Override
				public void handle(Event event) {
					cnt ++ ;
					int rnd = (int)(Math.random() * 100) + 1;
					String com = "";
					String res = "";
					
					if(rnd >= 50) {
						com = "홀";
					}else {
						com = "짝";
					}
					
					String me = tfm.getText();
					if(me.equals(com)) {
						res = "이겼습니다.";
					}else {
						res = "졌습니다.";
					}
					
					tfc.setText(com);
					tfr.setText(res);
					cnt2.setText(cnt+"");
					
					
					
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
