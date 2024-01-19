package add_student;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddStudentScreen {

	public static void showAddStudentScreen() {

		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:///C:\\Users\\PRAJAKTA\\eclipse-workspace\\StudentManagementJavaFxDB\\src\\add_student\\AddStudent.fxml"));
			StageFactory.stage.setTitle("Add Student Screen");
			Scene scene = new Scene(actorGroup, 755, 561);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
