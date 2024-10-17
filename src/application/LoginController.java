package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {
	@FXML
    private TextField usernameInput;
	
    @FXML
    private PasswordField passwordInput;
    
    @FXML
    private Label errorMesssage;
    
    private Admin admin = new Admin();
    
    @FXML
    void handleLoginButton(ActionEvent event) {
    	try {
    		String username = usernameInput.getText();
            String password = passwordInput.getText();
            
            if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
                // Admin login success
                errorMesssage.setText("Welcome Admin");
            } else {
                // Invalid credentials
                errorMesssage.setText("Invalid username or password");
            }
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("handleLoginButton Error :" + e);
    	}
    }
}