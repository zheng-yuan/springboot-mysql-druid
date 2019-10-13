package com.example.demo.system.service;

import java.util.List;
import com.example.demo.system.domain.SysUser;

/**
 * 用户 业务层
 * 
 * @author ruoyi
 */
public interface ISysUserService
{
    public SysUser selectUserByLoginName(String userName);
    public List<SysUser> selectUserList(SysUser user);
}
