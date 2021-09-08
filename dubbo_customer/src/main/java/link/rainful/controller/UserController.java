package link.rainful.controller;

import link.rainful.pojo.User;
import link.rainful.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rainful
 * @create 2021/09/07
 */

@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }

}
