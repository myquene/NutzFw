/*
 * Copyright (c) 2019- 2019 threefish(https://gitee.com/threefish https://github.com/threefish) All Rights Reserved.
 * 本项目完全开源，商用完全免费。但请勿侵犯作者合法权益，如申请软著等。
 * 最后修改时间：2019/10/07 18:27:07
 * 源 码 地 址：https://gitee.com/threefish/NutzFw
 */

package com.nutzfw.modules.mobile.action;

import com.nutzfw.core.common.annotation.AutoCreateMenuAuth;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;

/**
 * @author 叶世游
 * @date 2018/7/11 18:03
 * @description 专门用户配置前端接口权限
 */
@IocBean
@At("/ss")
public class MobileInterfaceAction {
    /**
     * 配置移动端权限,无实际意义
     */
    @RequiresPermissions("mobileInterface")
    @AutoCreateMenuAuth(name = "移动端接口权限", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 1000)
    @At
    public void mobileInterface() {
    }

    @RequiresPermissions("mobileInterface.index")
    @AutoCreateMenuAuth(name = "首页", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 1, parentPermission = "mobileInterface")
    @At
    public void index() {
    }

    @RequiresPermissions("mobileInterface.functions")
    @AutoCreateMenuAuth(name = "功能", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 2, parentPermission = "mobileInterface")
    @At
    public void functions() {
    }

    @RequiresPermissions("mobileInterface.functions.roster")
    @AutoCreateMenuAuth(name = "花名册", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 1, parentPermission = "mobileInterface.functions")
    @At
    public void roster() {
    }

    @RequiresPermissions("mobileInterface.functions.statistics")
    @AutoCreateMenuAuth(name = "统计", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 2, parentPermission = "mobileInterface.functions")
    @At
    public void statistics() {
    }

    @RequiresPermissions("mobileInterface.userInfo")
    @AutoCreateMenuAuth(name = "个人", type = AutoCreateMenuAuth.RESOURCE, icon = "fa-cogs", shortNo = 3, parentPermission = "mobileInterface")
    @At
    public void userInfo() {
    }
}
