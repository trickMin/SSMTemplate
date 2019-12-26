package org.yt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yt.entity.User;
import org.yt.service.UserService;

import java.util.List;

/**
 * ClassName: UserController <br/>
 * Description: 用户控制器层<br/>
 * date: 2019/12/26 14:39 <br/>
 *
 * @author Min <br/>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 注入业务层
     */
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/queryAll")
    public List<User> showAllUsers(){
        return userService.listAllUsers();
    }

    /**
     * 通过id查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/query/{id}")
    public User getUserById(@PathVariable("id")Integer id){
        return userService.getUserById(id);
    }

    /**
     * 新增用户
     * @param username
     * @param password
     * @param age
     * @return
     */
    @PostMapping("/add/{username}/{password}/{age}")
    public Integer addUser(@PathVariable("username")String username,@PathVariable("password")String password,@PathVariable("age")Integer age){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return userService.addUser(user);
    }

    /**
     * 修改用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/update/{id}")
    public Integer updateUserById(@PathVariable("id")Integer id,User user){
        user.setId(id);
        return userService.updateUserById(user);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public Integer deleteUserById(@PathVariable("id")Integer id){
        return userService.deleteUserById(id);
    }
}
