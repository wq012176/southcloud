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
import com.ruoyi.bomb.domain.BbWeekplan;
import com.ruoyi.bomb.service.IBbWeekplanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 周计划主档Controller
 * 
 * @author wq
 * @date 2022-01-08
 */
@Controller
@RequestMapping("/bomb/weekplan")
public class BbWeekplanController extends BaseController
{
    private String prefix = "bomb/weekplan";

    @Autowired
    private IBbWeekplanService bbWeekplanService;

    @RequiresPermissions("bomb:weekplan:view")
    @GetMapping()
    public String weekplan()
    {
        return prefix + "/weekplan";
    }

    /**
     * 查询周计划主档列表
     */
    @RequiresPermissions("bomb:weekplan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BbWeekplan bbWeekplan)
    {
        startPage();
        List<BbWeekplan> list = bbWeekplanService.selectBbWeekplanList(bbWeekplan);
        return getDataTable(list);
    }

    /**
     * 导出周计划主档列表
     */
    @RequiresPermissions("bomb:weekplan:export")
    @Log(title = "周计划主档", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BbWeekplan bbWeekplan)
    {
        List<BbWeekplan> list = bbWeekplanService.selectBbWeekplanList(bbWeekplan);
        ExcelUtil<BbWeekplan> util = new ExcelUtil<BbWeekplan>(BbWeekplan.class);
        return util.exportExcel(list, "周计划主档数据");
    }

    /**
     * 新增周计划主档
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存周计划主档
     */
    @RequiresPermissions("bomb:weekplan:add")
    @Log(title = "周计划主档", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BbWeekplan bbWeekplan)
    {
        return toAjax(bbWeekplanService.insertBbWeekplan(bbWeekplan));
    }

    /**
     * 修改周计划主档
     */
    @RequiresPermissions("bomb:weekplan:edit")
    @GetMapping("/edit/{planId}")
    public String edit(@PathVariable("planId") Long planId, ModelMap mmap)
    {
        BbWeekplan bbWeekplan = bbWeekplanService.selectBbWeekplanByPlanId(planId);
        mmap.put("bbWeekplan", bbWeekplan);
        return prefix + "/edit";
    }

    /**
     * 修改保存周计划主档
     */
    @RequiresPermissions("bomb:weekplan:edit")
    @Log(title = "周计划主档", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BbWeekplan bbWeekplan)
    {
        return toAjax(bbWeekplanService.updateBbWeekplan(bbWeekplan));
    }

    /**
     * 删除周计划主档
     */
    @RequiresPermissions("bomb:weekplan:remove")
    @Log(title = "周计划主档", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bbWeekplanService.deleteBbWeekplanByPlanIds(ids));
    }
}
