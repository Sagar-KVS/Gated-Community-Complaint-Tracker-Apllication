package dao;

import com.model.RegisterData;
import com.util.HqlConstants;

public class LoginDao {

	public static boolean isValidLogin(RegisterData regData) {
		RegisterData validData = HqlConstants.validUser(regData);
		if (regData.getEmail().equals(validData.getEmail()) && regData.getPassword().equals(validData.getPassword())) {
			return true;
		}
		return false;
	}
}
