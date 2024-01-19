package edit_student;

import java.sql.ResultSet;
import java.sql.SQLException;
import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import student_management.StudentManagementScreen;

public class EditStudentController {

	@FXML
	private TextField studentNameToEdit;

	@FXML
	private TextField newStudentName;

	@FXML
	private TextField newLoginName;

	@FXML
	private TextField newRollNumber;

	@FXML
	private TextField newPassword;
	@FXML
	private TextField newConfirmPassword;

	@FXML
	private Button close;

	@FXML
	private Button update;

	public void updateStudent(ActionEvent event) throws SQLException {
		boolean status = studentToEdit(studentNameToEdit.getText());
		if (status) {
			edit();
			System.out.println("Student information is updated Successfully !");
		} else {
			System.out.println("Student information is not updated");
		}
	}

	public void backToStudentManagement(ActionEvent event) {
		StudentManagementScreen.showStudentManagementScreen();
	}

	public boolean studentToEdit(String studentNameToEdit) {
		String query = "select * from student where student_name='" + studentNameToEdit + "'";
		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void edit() {
		String updatequery = "update student Set " + " student_name='" + newStudentName.getText() + "',login_name='"
				+ newLoginName.getText() + "',student_roll_number='" + newRollNumber.getText() + "',password='"
				+ newPassword.getText() + "',confirm_password='" + newConfirmPassword.getText()
				+ "'where student_name='" + studentNameToEdit.getText() + "';";
		DBUtils.executeQuery(updatequery);

	}
}
	