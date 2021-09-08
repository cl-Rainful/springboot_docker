package link.rainful.service;

import link.rainful.pojo.User;

/**
 * @author Rainful
 * @create 2021/09/07
 */

public interface UserService {

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getById(Integer id);
}
