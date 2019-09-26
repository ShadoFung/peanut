package online.mingdong.peanut.service;

import java.util.List;

import online.mingdong.peanut.model.SysUser;

public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}