package org.yt.service;

import org.yt.entity.User;

import java.util.List;

/**
 * ClassName: UserService <br/>
 * Description: 用户业务方法的接口<br/>
 * date: 2019/12/26 14:09 <br/>
 *
 * @author Min <br/>
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> listAllUsers();

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 添加新用户
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * 更新已存在的用户信息
     * @param user
     * @return
     */
    Integer updateUserById(User user);

    /**
     * 通过id删除已经存在的用户
     * @param id
     * @return
     */
    Integer deleteUserById(Integer id);
}
