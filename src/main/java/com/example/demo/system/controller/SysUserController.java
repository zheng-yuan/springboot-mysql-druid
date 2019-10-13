package com.example.demo.system.controller;

import com.example.demo.system.domain.SysUser;
import com.example.demo.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/system/user")
public class SysUserController {
    private String prefix = "system/user";

    @Autowired
    private ISysUserService userService;

    @PostMapping("/list")
    @ResponseBody
    public List<SysUser> list(SysUser user)
    {
        List<SysUser> list = userService.selectUserList(user);
        return list;
    }
    @GetMapping("/user/{loginName}")
    @ResponseBody
    public SysUser edit(@PathVariable("loginName") String loginName)
    {
       return userService.selectUserByLoginName(loginName);
       // return prefix + "/edit";
    }
    @GetMapping("/user")
    @ResponseBody
    public SysUser queryOne(@RequestParam("loginName") String loginName)
    {
       return userService.selectUserByLoginName(loginName);
       // return prefix + "/edit";
    }
}
