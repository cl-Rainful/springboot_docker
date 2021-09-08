package link.rainful.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rainful
 * @create 2021/09/07
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String email;
}
