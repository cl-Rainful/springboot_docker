package link.rainful.mapper;

import link.rainful.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Rainful
 * @create 2021/09/07
 */

@Mapper
public interface UserMapper {

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getById(Integer id);
}
