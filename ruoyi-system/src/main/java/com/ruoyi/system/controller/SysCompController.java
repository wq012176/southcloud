package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.domain.entity.SysComp;
import com.ruoyi.system.service.ISysCompService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公司别Controller
 * 
 * @author wq
 * @date 2022-02-21
 */
@Controller
@RequestMapping("/system/comp")
public class SysCompController extends BaseController
{
    private String prefix = "system/comp";

    @Autowired
    private ISysCompService sysCompService;

    @RequiresPermissions("system:comp:view")
    @GetMapping()
    public String comp()
    {
        return prefix + "/comp";
    }

    /**
     * 查询公司别列表
     */
    @RequiresPermissions("system:comp:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysComp sysComp)
    {
        startPage();
        List<SysComp> list = sysCompService.selectSysCompList(sysComp);
        return getDataTable(list);
    }

    /**
     * 导出公司别列表
     */
    @RequiresPermissions("system:comp:export")
    @Log(title = "公司别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysComp sysComp)
    {
        List<SysComp> list = sysCompService.selectSysCompList(sysComp);
        ExcelUtil<SysComp> util = new ExcelUtil<SysComp>(SysComp.class);
        return util.exportExcel(list, "公司别数据");
    }

    /**
     * 新增公司别
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公司别
     */
    @RequiresPermissions("system:comp:add")
    @Log(title = "公司别", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysComp sysComp)
    {
        return toAjax(sysCompService.insertSysComp(sysComp));
    }

    /**
     * 修改公司别
     */
    @RequiresPermissions("system:comp:edit")
    @GetMapping("/edit/{compId}")
    public String edit(@PathVariable("compId") Long compId, ModelMap mmap)
    {
        SysComp sysComp = sysCompService.selectSysCompByCompId(compId);
        mmap.put("sysComp", sysComp);
        return prefix + "/edit";
    }

    /**
     * 修改保存公司别
     */
    @RequiresPermissions("system:comp:edit")
    @Log(title = "公司别", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysComp sysComp)
    {
        return toAjax(sysCompService.updateSysComp(sysComp));
    }

    /**
     * 删除公司别
     */
    @RequiresPermissions("system:comp:remove")
    @Log(title = "公司别", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysCompService.deleteSysCompByCompIds(ids));
    }
}
