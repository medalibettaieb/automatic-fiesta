package tn.wevioo.tc.demo.services;

import javax.ejb.Local;

import tn.wevioo.tc.demo.entities.User;
import tn.wevioo.tc.demo.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
