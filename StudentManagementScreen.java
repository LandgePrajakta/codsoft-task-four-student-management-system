package student_management;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class StudentManagementScreen {

	public static void showStudentManagementScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:///C:\\Users\\PRAJAKTA\\eclipse-workspace\\StudentManagementJavaFxDB\\src\\student_management\\StudentManagement.fxml"));
			StageFactory.stage.setTitle("Student Management");
			Scene scene = new Scene(actorGroup, 755, 561);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


