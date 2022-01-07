package com.ruoyi.resume.mapper;

import java.util.List;
import com.ruoyi.resume.domain.RsmSupplier;

/**
 * 供应商主档Mapper接口
 * 
 * @author wq
 * @date 2021-11-16
 */
public interface RsmSupplierMapper 
{
    /**
     * 查询供应商主档
     * 
     * @param supplierId 供应商主档主键
     * @return 供应商主档
     */
    public RsmSupplier selectRsmSupplierBySupplierId(String supplierId);

    /**
     * 查询供应商主档列表
     * 
     * @param rsmSupplier 供应商主档
     * @return 供应商主档集合
     */
    public List<RsmSupplier> selectRsmSupplierList(RsmSupplier rsmSupplier);

    /**
     * 新增供应商主档
     * 
     * @param rsmSupplier 供应商主档
     * @return 结果
     */
    public int insertRsmSupplier(RsmSupplier rsmSupplier);

    /**
     * 修改供应商主档
     * 
     * @param rsmSupplier 供应商主档
     * @return 结果
     */
    public int updateRsmSupplier(RsmSupplier rsmSupplier);

    /**
     * 删除供应商主档
     * 
     * @param supplierId 供应商主档主键
     * @return 结果
     */
    public int deleteRsmSupplierBySupplierId(String supplierId);

    /**
     * 批量删除供应商主档
     * 
     * @param supplierIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRsmSupplierBySupplierIds(String[] supplierIds);
}
