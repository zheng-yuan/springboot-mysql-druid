package com.example.demo.system.service.impl;

import com.example.demo.system.domain.SysUser;
import com.example.demo.system.mapper.SysUserMapper;
import com.example.demo.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 * 
 * @author ruoyi
 */

@Service
public class SysUserServiceImpl implements ISysUserService
{
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> selectUserList(SysUser user)
    {
        return sysUserMapper.selectUserList(user);
    }
    @Override
    public SysUser selectUserByLoginName(String userName)
    {
        return sysUserMapper.selectUserByLoginName(userName);
    }
}
