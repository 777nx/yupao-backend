package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户登录请求
 *
 * @author Fantasy
 */
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 4772243295366861457L;

    private String userAccount;

    private String userPassword;
}
