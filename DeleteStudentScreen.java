package delete_student;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteStudentScreen {

	public static void showDeleteStudentScreen() {

		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\PRAJAKTA\\eclipse-workspace\\StudentManagementJavaFxDB\\src\\delete_student\\DeleteStudent.fxml"));
			StageFactory.stage.setTitle("Delete Student");
			Scene scene = new Scene(actorGroup, 755, 561);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(false);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
