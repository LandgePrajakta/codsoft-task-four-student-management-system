package add_student;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import student_management.StudentManagementScreen;

public class AddStudentController {

	@FXML
	private TextField studentName;

	@FXML
	private TextField loginName;

	@FXML
	private TextField rollNumber;

	@FXML
	private TextField password;

	@FXML
	private TextField confirmPassword;

	@FXML
	private Button save;

	@FXML
	private Button close;

	public void saveStudent(ActionEvent event) {
		String query = "INSERT INTO student(student_name, login_name, student_roll_number, password, confirm_Password) VALUES ('"
				+ studentName.getText() + "', '" + loginName.getText() + "', '" + rollNumber.getText() + "','"
				+ password.getText() + "','" + confirmPassword.getText() + "')";
		DBUtils.executeQuery(query);
	}

	public void closeWindow(ActionEvent event) {
		StudentManagementScreen.showStudentManagementScreen();

	}
}
