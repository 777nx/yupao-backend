package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户退出队伍请求体
 */
@Data
public class TeamQuitRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 447472187202528894L;

    /**
     * id
     */
    private Long teamId;
}
