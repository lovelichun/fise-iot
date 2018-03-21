package com.fise.iot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fise.iot.common.dao.MyMapper;
import com.fise.iot.model.AuthUser;

public interface AuthUserMapper extends MyMapper<AuthUser> {

	AuthUser queryByUsername(@Param("username") String username);

	List<AuthUser> queryList(@Param("user")AuthUser user);

	List<Integer> queryRoleUids(@Param("roleid")int roleid);
}