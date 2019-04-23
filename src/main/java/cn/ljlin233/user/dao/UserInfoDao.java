package cn.ljlin233.user.dao;

import java.util.Date;
import java.util.List;
import cn.ljlin233.user.entity.UserInfo;

/**
 * UserInfoDao
 */
public interface UserInfoDao {

    public void addUserInfo(String account, String email, String registerTime);;

    public void deleteUserInfo();

    public void modifyUserInfo();

    public List<UserInfo> getAllUserInfo();

    public UserInfo getUserInfoById(int id);
    
    public int getUserIdByAccount(String account);

    public int existsAccount(String account);

    public int existsEmail(String email);

    public int existsPhone(String phone);
}