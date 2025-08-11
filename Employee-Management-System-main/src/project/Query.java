package project;

/**
 * Contains all Query required to perform the mysql operation it is used in
 * Operations Class.
 * 
 * @author Prathamesh
 *
 */
public class Query {
	public static final String TABLEQ = "SELECT * FROM employee_table"; // replace with your table
	public static final String POSTING = "SELECT post_name FROM posts"; // replace with your table
	public static final String INSERTEM = "INSERT INTO employee_table (fname, mname, lname, age, salary, address, postID) VALUES (?, ?, ?, ?, ?, ?, ?)";
	public static final String DELETEEM = "DELETE FROM employee_table WHERE id = ?";
	public static final String UPDATEEM = "UPDATE employee_table SET fname=?, mname=?, lname=?, age=?, salary=?, address=?, postID=? WHERE id=?";
}
