package com.yupi.yupao.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求
 *
 * @author Fantasy
 */
@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -7360266844878619800L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
