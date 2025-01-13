package Control;

import DAO.UserDAO;

public class UserControl {

    UserDAO userDAO = new UserDAO();
    
    public UserControl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    public boolean auth(int id, String username, String passwd) {
        return userDAO.auth(id, username, passwd);
    }
    
    public boolean add(String username, String passwd) {
        return userDAO.add(username, passwd);
    }
    
    public boolean del(String username, String passwd) {
        return userDAO.del(username, passwd);
    }
    
    public boolean exis(String username) {
        return userDAO.exis(username);
    }
    
    public String getPswByUser(String username) {
        return userDAO.getPswByUser(username);
    }
    
}
