package search_student;

import java.sql.ResultSet;
import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import student_management.StudentManagementScreen;

public class SearchStudentController {

	@FXML
	private TextField studentNameToSearch;

	@FXML
	private TextField studentName;

	@FXML
	private TextField studentLoginName;

	@FXML
	private TextField studentRollNumber;

	@FXML
	private TextField studentPassword;

	@FXML
	private Button search;

	@FXML
	private Button close;

	public void searchStudent(ActionEvent event) {

		search(studentNameToSearch.getText());

	}

	public void backToStudentManagement(ActionEvent event) {

		StudentManagementScreen.showStudentManagementScreen();
	}

	public void search(String studentNameToSearch) {
		String query = "select * from student where student_name ='" + studentNameToSearch + "' ";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		try {
			while (rs.next()) {
				if (rs.getString("student_name").equalsIgnoreCase(studentNameToSearch)) {
					studentName.setText(rs.getString("student_name"));
					studentLoginName.setText(rs.getString("login_name"));
					studentRollNumber.setText(rs.getString("student_roll_number"));
					studentPassword.setText(rs.getString("password"));
				}
			}
		} catch (Exception e) {
			System.out.println("Student not found");
		}
	}
}
