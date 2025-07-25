package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户加入队伍请求体
 */
@Data
public class TeamJoinRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 2093687623919443279L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
