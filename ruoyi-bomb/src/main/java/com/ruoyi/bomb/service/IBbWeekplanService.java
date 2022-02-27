package com.ruoyi.bomb.service;

import java.util.List;
import com.ruoyi.bomb.domain.BbWeekplan;

/**
 * 周计划主档Service接口
 * 
 * @author wq
 * @date 2022-01-08
 */
public interface IBbWeekplanService 
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
     * 批量删除周计划主档
     * 
     * @param planIds 需要删除的周计划主档主键集合
     * @return 结果
     */
    public int deleteBbWeekplanByPlanIds(String planIds);

    /**
     * 删除周计划主档信息
     * 
     * @param planId 周计划主档主键
     * @return 结果
     */
    public int deleteBbWeekplanByPlanId(Long planId);
}
