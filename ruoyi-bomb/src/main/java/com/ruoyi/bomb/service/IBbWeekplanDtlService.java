package com.ruoyi.bomb.service;

import java.util.List;
import com.ruoyi.bomb.domain.BbWeekplanDtl;

/**
 * 周计划明细档Service接口
 * 
 * @author wq
 * @date 2022-03-01
 */
public interface IBbWeekplanDtlService 
{
    /**
     * 查询周计划明细档
     * 
     * @param planDtlId 周计划明细档主键
     * @return 周计划明细档
     */
    public BbWeekplanDtl selectBbWeekplanDtlByPlanDtlId(Long planDtlId);

    /**
     * 查询周计划明细档列表
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 周计划明细档集合
     */
    public List<BbWeekplanDtl> selectBbWeekplanDtlList(BbWeekplanDtl bbWeekplanDtl);

    /**
     * 新增周计划明细档
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 结果
     */
    public int insertBbWeekplanDtl(BbWeekplanDtl bbWeekplanDtl);

    /**
     * 修改周计划明细档
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 结果
     */
    public int updateBbWeekplanDtl(BbWeekplanDtl bbWeekplanDtl);

    /**
     * 批量删除周计划明细档
     * 
     * @param planDtlIds 需要删除的周计划明细档主键集合
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanDtlIds(String planDtlIds);

    /**
     * 删除周计划明细档信息
     * 
     * @param planDtlId 周计划明细档主键
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanDtlId(Long planDtlId);
}
