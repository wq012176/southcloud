package com.ruoyi.resume.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.resume.mapper.RsmSupplierMapper;
import com.ruoyi.resume.domain.RsmSupplier;
import com.ruoyi.resume.service.IRsmSupplierService;
import com.ruoyi.common.core.text.Convert;

/**
 * 供应商主档Service业务层处理
 * 
 * @author wq
 * @date 2021-11-16
 */
@Service
public class RsmSupplierServiceImpl implements IRsmSupplierService 
{
    @Autowired
    private RsmSupplierMapper rsmSupplierMapper;

    /**
     * 查询供应商主档
     * 
     * @param supplierId 供应商主档主键
     * @return 供应商主档
     */
    @Override
    public RsmSupplier selectRsmSupplierBySupplierId(String supplierId)
    {
        return rsmSupplierMapper.selectRsmSupplierBySupplierId(supplierId);
    }

    /**
     * 查询供应商主档列表
     * 
     * @param rsmSupplier 供应商主档
     * @return 供应商主档
     */
    @Override
    public List<RsmSupplier> selectRsmSupplierList(RsmSupplier rsmSupplier)
    {
        return rsmSupplierMapper.selectRsmSupplierList(rsmSupplier);
    }

    /**
     * 新增供应商主档
     * 
     * @param rsmSupplier 供应商主档
     * @return 结果
     */
    @Override
    public int insertRsmSupplier(RsmSupplier rsmSupplier)
    {
        return rsmSupplierMapper.insertRsmSupplier(rsmSupplier);
    }

    /**
     * 修改供应商主档
     * 
     * @param rsmSupplier 供应商主档
     * @return 结果
     */
    @Override
    public int updateRsmSupplier(RsmSupplier rsmSupplier)
    {
        return rsmSupplierMapper.updateRsmSupplier(rsmSupplier);
    }

    /**
     * 批量删除供应商主档
     * 
     * @param supplierIds 需要删除的供应商主档主键
     * @return 结果
     */
    @Override
    public int deleteRsmSupplierBySupplierIds(String supplierIds)
    {
        return rsmSupplierMapper.deleteRsmSupplierBySupplierIds(Convert.toStrArray(supplierIds));
    }

    /**
     * 删除供应商主档信息
     * 
     * @param supplierId 供应商主档主键
     * @return 结果
     */
    @Override
    public int deleteRsmSupplierBySupplierId(String supplierId)
    {
        return rsmSupplierMapper.deleteRsmSupplierBySupplierId(supplierId);
    }
}
