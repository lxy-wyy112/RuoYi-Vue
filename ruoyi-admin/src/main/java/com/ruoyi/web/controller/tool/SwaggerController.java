package com.ruoyi.web.controller.tool;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ruoyi.common.core.controller.BaseController;

/**
 * swagger 接口
 * 
 * @author ruoyi
 */
@Api("swagger 接口")
@Controller
@RequestMapping("/tool/swagger")
public class SwaggerController extends BaseController
{
    @ApiOperation("/swagger-ui.html")
    @PreAuthorize("@ss.hasPermi('tool:swagger:view')")
    @GetMapping()
    public String index()
    {
        return redirect("/swagger-ui.html");
    }
}
