package com.example.demo.system.mapper;

import com.example.demo.system.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;


/**
 * 用户表 数据层
 *
 * @author ruoyi
 */
//@Component
@Mapper
public interface SysUserMapper
{
        public SysUser selectUserByLoginName(String userName);
        public List<SysUser> selectUserList(SysUser sysUser);
}
