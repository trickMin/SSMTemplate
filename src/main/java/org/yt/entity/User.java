package org.yt.entity;

import lombok.Data;

/**
 * ClassName: User <br/>
 * Description: 用户实体类(测试对象类)<br/>
 * date: 2019/12/26 14:09 <br/>
 *
 * @author Min <br/>
 */

@Data   //@Data注解用于生成实体类的getter && setter && toString等方法
public class User {
    private Integer id;   //用户id
    private String username;   //用户账号
    private String password;   //用户密码
    private Integer age;   //用户年龄
}
