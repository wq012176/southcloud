package com.ruoyi.resume.controller;

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
import com.ruoyi.resume.domain.RsmSupplier;
import com.ruoyi.resume.service.IRsmSupplierService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应商主档Controller
 * 
 * @author wq
 * @date 2021-11-16
 */
@Controller
@RequestMapping("/resume/supplier")
public class RsmSupplierController extends BaseController
{
    private String prefix = "resume/supplier";

    @Autowired
    private IRsmSupplierService rsmSupplierService;

    @RequiresPermissions("resume:supplier:view")
    @GetMapping()
    public String supplier()
    {
        return prefix + "/supplier";
    }

    /**
     * 查询供应商主档列表
     */
    @RequiresPermissions("resume:supplier:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RsmSupplier rsmSupplier)
    {
        startPage();
        List<RsmSupplier> list = rsmSupplierService.selectRsmSupplierList(rsmSupplier);
        return getDataTable(list);
    }

    /**
     * 导出供应商主档列表
     */
    @RequiresPermissions("resume:supplier:export")
    @Log(title = "供应商主档", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RsmSupplier rsmSupplier)
    {
        List<RsmSupplier> list = rsmSupplierService.selectRsmSupplierList(rsmSupplier);
        ExcelUtil<RsmSupplier> util = new ExcelUtil<RsmSupplier>(RsmSupplier.class);
        return util.exportExcel(list, "供应商主档数据");
    }

    /**
     * 新增供应商主档
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供应商主档
     */
    @RequiresPermissions("resume:supplier:add")
    @Log(title = "供应商主档", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RsmSupplier rsmSupplier)
    {
        return toAjax(rsmSupplierService.insertRsmSupplier(rsmSupplier));
    }

    /**
     * 修改供应商主档
     */
    @GetMapping("/edit/{supplierId}")
    public String edit(@PathVariable("supplierId") String supplierId, ModelMap mmap)
    {
        RsmSupplier rsmSupplier = rsmSupplierService.selectRsmSupplierBySupplierId(supplierId);
        mmap.put("rsmSupplier", rsmSupplier);
        return prefix + "/edit";
    }

    /**
     * 修改保存供应商主档
     */
    @RequiresPermissions("resume:supplier:edit")
    @Log(title = "供应商主档", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RsmSupplier rsmSupplier)
    {
        return toAjax(rsmSupplierService.updateRsmSupplier(rsmSupplier));
    }

    /**
     * 删除供应商主档
     */
    @RequiresPermissions("resume:supplier:remove")
    @Log(title = "供应商主档", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rsmSupplierService.deleteRsmSupplierBySupplierIds(ids));
    }
}
