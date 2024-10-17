package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
//		This is to catch all types of errors occurred
		try {
			
//			UI manager class to change scene
			UIManager ui = new UIManager(stage);
			ui.changeUI("UserLoginScene.fxml", "Login");
			
//			Generates root of the stage 
//			Parent root = FXMLLoader.load(getClass().getResource("UserLoginScene.fxml"));
//			Scene scene = new Scene(root);
			
//			To set icon to the window
//			Image icon = new Image("icon.png");
//			stage.getIcons().add(icon);
//			
//			To set title of the project
//			stage.setTitle("Book Store");
			
//			Disable Screen resize
//			stage.setResizable(false);
			
//			set the scene and show the stage
//			stage.setScene(scene);
//			stage.show();
		} catch(Exception e) {
			System.out.println("Main : " + e);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
