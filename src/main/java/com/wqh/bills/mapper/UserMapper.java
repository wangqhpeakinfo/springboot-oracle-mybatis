package com.wqh.bills.mapper;

import com.wqh.bills.entity.User;
import com.wqh.bills.model.user.LoginRecord;
import java.math.BigDecimal;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUserList();

    User login(LoginRecord loginRecord);
}