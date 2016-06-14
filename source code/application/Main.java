package application;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	

	
	public static void main(String[] args) {
		launch(args);
	}


	
	@Override
	public void start(Stage primaryStage){
		try {
			
			Parent root =  FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResource("logo.png").toString()));
			
			primaryStage.setResizable(false);
			primaryStage.setTitle("Calculator");
			
			primaryStage.show();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
