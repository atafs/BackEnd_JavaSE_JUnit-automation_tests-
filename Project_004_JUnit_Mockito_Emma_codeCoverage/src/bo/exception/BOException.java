package bo.exception;

import java.sql.SQLException;

public class BOException extends Exception {

	//ATTRIBUTES
	private static final long serialVersionUID = 1L;

	//CONSTRUCTOR
	public BOException(SQLException e) {
		super(e);
	}

}
