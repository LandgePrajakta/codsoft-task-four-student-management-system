package home_screen;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;

import student_management.StudentManagementScreen;

public class HomeScreenController {

	@FXML
	private Button studentManagement;

	@FXML
	private Button back;

	public void showStudentManagementScreen(ActionEvent event) {
		StudentManagementScreen.showStudentManagementScreen();
	}

	public void backToLogin(ActionEvent event) {
		LoginScreen.showLoginScreen();
	}
}
