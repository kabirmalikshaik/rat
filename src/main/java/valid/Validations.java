package valid;
import java.util.ResourceBundle;
public class Validations {
	public boolean check(String a,String b)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String username=rb.getString("uname");
		String password=rb.getString("password");
		if(username.equals(a) && password.equals(b))
		{
			return true;
		}
		return false;
	}
	}

