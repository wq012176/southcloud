package com.ruoyi.bomb.controller;

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
import com.ruoyi.bomb.domain.BbWeekplanDtl;
import com.ruoyi.bomb.service.IBbWeekplanDtlService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 周计划明细档Controller
 * 
 * @author wq
 * @date 2022-03-01
 */
@Controller
@RequestMapping("/bomb/weekplandtl")
public class BbWeekplanDtlController extends BaseController
{
    private String prefix = "bomb/weekplandtl";

    @Autowired
    private IBbWeekplanDtlService bbWeekplanDtlService;

    @RequiresPermissions("bomb:weekplandtl:view")
    @GetMapping()
    public String weekplandtl()
    {
        return prefix + "/weekplandtl";
    }

    /**
     * 查询周计划明细档列表
     */
    @RequiresPermissions("bomb:weekplandtl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BbWeekplanDtl bbWeekplanDtl)
    {
        startPage();
        List<BbWeekplanDtl> list = bbWeekplanDtlService.selectBbWeekplanDtlList(bbWeekplanDtl);
        return getDataTable(list);
    }

    /**
     * 导出周计划明细档列表
     */
    @RequiresPermissions("bomb:weekplandtl:export")
    @Log(title = "周计划明细档", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BbWeekplanDtl bbWeekplanDtl)
    {
        List<BbWeekplanDtl> list = bbWeekplanDtlService.selectBbWeekplanDtlList(bbWeekplanDtl);
        ExcelUtil<BbWeekplanDtl> util = new ExcelUtil<BbWeekplanDtl>(BbWeekplanDtl.class);
        return util.exportExcel(list, "周计划明细档数据");
    }

    /**
     * 新增周计划明细档
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存周计划明细档
     */
    @RequiresPermissions("bomb:weekplandtl:add")
    @Log(title = "周计划明细档", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BbWeekplanDtl bbWeekplanDtl)
    {
        return toAjax(bbWeekplanDtlService.insertBbWeekplanDtl(bbWeekplanDtl));
    }

    /**
     * 修改周计划明细档
     */
    @RequiresPermissions("bomb:weekplandtl:edit")
    @GetMapping("/edit/{planDtlId}")
    public String edit(@PathVariable("planDtlId") Long planDtlId, ModelMap mmap)
    {
        BbWeekplanDtl bbWeekplanDtl = bbWeekplanDtlService.selectBbWeekplanDtlByPlanDtlId(planDtlId);
        mmap.put("bbWeekplanDtl", bbWeekplanDtl);
        return prefix + "/edit";
    }

    /**
     * 修改保存周计划明细档
     */
    @RequiresPermissions("bomb:weekplandtl:edit")
    @Log(title = "周计划明细档", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BbWeekplanDtl bbWeekplanDtl)
    {
        return toAjax(bbWeekplanDtlService.updateBbWeekplanDtl(bbWeekplanDtl));
    }

    /**
     * 删除周计划明细档
     */
    @RequiresPermissions("bomb:weekplandtl:remove")
    @Log(title = "周计划明细档", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bbWeekplanDtlService.deleteBbWeekplanDtlByPlanDtlIds(ids));
    }
}
