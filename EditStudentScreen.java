package edit_student;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditStudentScreen {

	public static void showEditStudentScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:///C:\\Users\\PRAJAKTA\\eclipse-workspace\\StudentManagementJavaFxDB\\src\\edit_student\\EditStudent.fxml"));
			StageFactory.stage.setTitle("Edit Student Screen");
			Scene scene = new Scene(actorGroup, 755, 561);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
