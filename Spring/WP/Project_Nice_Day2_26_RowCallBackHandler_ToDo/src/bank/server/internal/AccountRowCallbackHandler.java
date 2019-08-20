package bank.server.internal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class AccountRowCallbackHandler implements RowCallbackHandler{
    FileWriter writer;
	@Override
	public void processRow(ResultSet rs) throws SQLException {
		System.out.println("Calling processRow method"+rs);
		String str = rs.getInt(3)+" ,"+rs.getString(1)+" ,"+rs.getInt(2);
		try {
			writer.write(str+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			    
	}
	public AccountRowCallbackHandler(Writer out) {
		
			this.writer = (FileWriter) out;
		
	}

}
