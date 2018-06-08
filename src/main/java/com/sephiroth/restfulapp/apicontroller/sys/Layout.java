package com.sephiroth.restfulapp.apicontroller.sys;

import com.sephiroth.restfulapp.service.sys.LayoutService;
import com.sephiroth.restfulapp.utilshelper.controller.ResultBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 吴占超
 * @Description:
 * @Date: Create in 13:33 2018/6/8
 * @Modified By:
 */
@Api("布局信息")
@RestController
public class Layout {

    @Autowired
    private LayoutService layoutService;

    /**
     * 获取导航
     * @return
     */
    @ApiOperation("获取导航列表")
    @GetMapping(value = "/layout/navigation")
    public ResultBase navigation() {
        return new ResultBase(layoutService.navigation(null));
    }
}
