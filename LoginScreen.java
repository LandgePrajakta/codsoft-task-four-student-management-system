package login;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginScreen {

	public static void showLoginScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:///C:\\Users\\PRAJAKTA\\eclipse-workspace\\StudentManagementJavaFxDB\\src\\login\\StudentLogin.fxml"));
			StageFactory.stage.setTitle("Login Screen");
			Scene scene = new Scene(actorGroup, 616, 390);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
