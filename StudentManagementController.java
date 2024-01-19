package student_management;

import add_student.AddStudentScreen;
import delete_student.DeleteStudentScreen;
import edit_student.EditStudentScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_student.SearchStudentScreen;

public class StudentManagementController {

	@FXML
	private Button addStudent;

	@FXML
	private Button editStudent;

	@FXML
	private Button searchStudent;

	@FXML
	private Button deleteStudent;

	@FXML
	private Button quit;

	public void showAddStudentScreen(ActionEvent event) {
		AddStudentScreen.showAddStudentScreen();
	}

	public void showEditStudentScreen(ActionEvent event) {
		EditStudentScreen.showEditStudentScreen();
	}

	public void showSearchStudentScreen(ActionEvent event) {
		SearchStudentScreen.showSearchStudentScreen();
	}

	public void deleteStudent(ActionEvent event) {
		DeleteStudentScreen.showDeleteStudentScreen();
	}

	public void backToHomeScreen(ActionEvent event) {
		HomeScreen.showHomeScreen();
	}
}
