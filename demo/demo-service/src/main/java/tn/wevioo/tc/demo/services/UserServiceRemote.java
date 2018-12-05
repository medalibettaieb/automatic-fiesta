package tn.wevioo.tc.demo.services;

import javax.ejb.Remote;

import tn.wevioo.tc.demo.entities.User;
import tn.wevioo.tc.demo.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
