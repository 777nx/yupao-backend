package com.yupi.yupao.mapper;

import com.yupi.yupao.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Fantasy
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2025-07-17 15:11:00
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




