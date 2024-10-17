package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class UIManager {
	
	private Stage stage;
	
	public UIManager(Stage stage) {
		
		this.stage = stage;
		
//		Set icon
		Image icon = new Image("icon.png");
		this.stage.getIcons().add(icon);
		
//		Disable Screen resize
		stage.setResizable(false);
		
	}
	
	public void changeUI(String fxmlFilename,String title) {
		try {
//			load Fxml file
			FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFilename));
            Parent root = loader.load();
            
//            Set scene and title
            Scene scene = new Scene(root);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
		}
		catch (Exception e)
		{
			System.out.println("UI ERROR : " + e);
		}
	}

}
