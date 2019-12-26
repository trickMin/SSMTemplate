package org.yt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.yt.entity.User;
import org.yt.mapper.UserMapper;
import org.yt.service.UserService;

import java.util.List;
import java.util.logging.Logger;

/**
 * ClassName: UserServiceImpl <br/>
 * Description: 用户业务的方法实现类<br/>
 * date: 2019/12/26 14:16 <br/>
 *
 * @author Min <br/>
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 注入持久层
     */
    @Autowired
    private UserMapper userMapper;
    //生成日志类
    private Logger logger = Logger.getLogger(this.getClass().getName());

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> listAllUsers() {
        List<User> userList = userMapper.listAllUsers();
        return userList;
    }

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        User user = null;
        if (!ObjectUtils.isEmpty(id) && id>0){
            //做非法判断
            user = userMapper.getUserById(id);
        }
        return user;
    }

    /**
     * 添加新用户
     * @param user
     * @return
     */
    @Override
    public Integer addUser(User user) {
        logger.info("成功激怒addUser。。。。");
        Integer count = 0;
        if (!ObjectUtils.isEmpty(user)){
            user.setId(null);
            count = userMapper.addUser(user);
            logger.info("user:"+user);
        }
        logger.info("当前的count:"+count);
        return count;
    }

    /**
     * 更新已存在的用户信息
     * @param user
     * @return
     */
    @Override
    public Integer updateUserById(User user) {
        Integer id = user.getId();
        Integer count = 0;
        if (ObjectUtils.isEmpty(user) || null==id || id<0){
        }
        User preUser = userMapper.getUserById(id);
        if (preUser != null){
            count = userMapper.updateUserById(user);
        }
        return count;
    }

    /**
     * 通过id删除已经存在的用户
     * @param id
     * @return
     */
    @Override
    public Integer deleteUserById(Integer id) {
        Integer count = 0;
        if (ObjectUtils.isEmpty(id) || id<0){
            return count;
        }else {
            count = userMapper.deleteUserById(id);
        }
        return count;
    }
}
