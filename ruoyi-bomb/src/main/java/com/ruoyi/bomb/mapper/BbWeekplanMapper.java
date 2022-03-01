package com.ruoyi.bomb.mapper;

import java.util.List;
import com.ruoyi.bomb.domain.BbWeekplan;
import com.ruoyi.bomb.domain.BbWeekplanDtl;

/**
 * 周计划主档Mapper接口
 * 
 * @author wq
 * @date 2022-03-01
 */
public interface BbWeekplanMapper 
{
    /**
     * 查询周计划主档
     * 
     * @param planId 周计划主档主键
     * @return 周计划主档
     */
    public BbWeekplan selectBbWeekplanByPlanId(Long planId);

    /**
     * 查询周计划主档列表
     * 
     * @param bbWeekplan 周计划主档
     * @return 周计划主档集合
     */
    public List<BbWeekplan> selectBbWeekplanList(BbWeekplan bbWeekplan);

    /**
     * 新增周计划主档
     * 
     * @param bbWeekplan 周计划主档
     * @return 结果
     */
    public int insertBbWeekplan(BbWeekplan bbWeekplan);

    /**
     * 修改周计划主档
     * 
     * @param bbWeekplan 周计划主档
     * @return 结果
     */
    public int updateBbWeekplan(BbWeekplan bbWeekplan);

    /**
     * 删除周计划主档
     * 
     * @param planId 周计划主档主键
     * @return 结果
     */
    public int deleteBbWeekplanByPlanId(Long planId);

    /**
     * 批量删除周计划主档
     * 
     * @param planIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbWeekplanByPlanIds(String[] planIds);

    /**
     * 批量删除周计划明细档
     * 
     * @param planIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanIds(String[] planIds);
    
    /**
     * 批量新增周计划明细档
     * 
     * @param bbWeekplanDtlList 周计划明细档列表
     * @return 结果
     */
    public int batchBbWeekplanDtl(List<BbWeekplanDtl> bbWeekplanDtlList);
    

    /**
     * 通过周计划主档主键删除周计划明细档信息
     * 
     * @param planId 周计划主档ID
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanId(Long planId);
}
