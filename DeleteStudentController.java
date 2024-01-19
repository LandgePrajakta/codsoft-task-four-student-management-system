package delete_student;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import student_management.StudentManagementScreen;

public class DeleteStudentController {

	@FXML
	private TextField studentNameToDelete;

	@FXML
	private TextField studentMessage;

	@FXML
	private Button close;

	@FXML
	private Button delete;

	public void deleteStudent(ActionEvent event) {
		boolean status = delete(studentNameToDelete.getText());
		if (status) {
			delete(studentNameToDelete.getText());
			studentMessage.setText("Student deleted Successfully");
		} else {
			studentMessage.setText("Student Not Found");
		}
	}

	public void backToStudentManagement(ActionEvent event) {
		StudentManagementScreen.showStudentManagementScreen();
	}

	public boolean delete(String studentNameToDelete) {
		String query = "delete from student where student_name = '" + studentNameToDelete + "' ";
		DBUtils.executeQuery(query);
		return true;
	}
}
