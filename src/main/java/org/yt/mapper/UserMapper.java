package org.yt.mapper;

import org.yt.entity.User;

import java.util.List;

/**
 * ClassName: UserMapper <br/>
 * Description: <br/>
 * date: 2019/12/26 14:18 <br/>
 *
 * @author Min <br/>
 */
public interface UserMapper {
    /**
     * 查询所有用户信息
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
