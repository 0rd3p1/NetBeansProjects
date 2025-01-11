package Control;

import DAO.UserDAO;
import Model.Users;

public class CalculatorControl {

    UserDAO userDAO = new UserDAO();
    
    public CalculatorControl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public Users auth(int id, String username, String passwd) {
        return userDAO.auth(id, username, passwd);
    }
    
    public Users add(String username, String passwd) {
        return userDAO.add(username, passwd);
    }
    
    public Users del(String username, String passwd) {
        return userDAO.del(username, passwd);
    }
    
    public void hist(String username) {
        userDAO.hist(username);
    }
    
}
