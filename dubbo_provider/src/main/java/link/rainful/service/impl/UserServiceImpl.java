package link.rainful.service.impl;

import link.rainful.mapper.UserMapper;
import link.rainful.pojo.User;
import link.rainful.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Rainful
 * @create 2021/09/07
 */

@DubboService
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}
