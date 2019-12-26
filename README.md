# SSMTemplate
基于SSM整合的精简项目
完成SSM整合的精简框架，测试为一套基于RESTful的CRUD
由于为了更方便查看，加入了动词辨识

1.查询所有
    GET http://localhost:8080/user/queryAll
2.按id查
    GET http://localhost:8080/user/query/{id}
3.增加新用户
    POST http://localhost:8080/user/add/{username}/{password}/{age}
4.修改用户
    PUT http://localhost:8080/user/{id}?username=xxx&password=xxx&age=xxx
5.根据id删除用户
    DELETE http://localhost:8080/user/delete/{id}
