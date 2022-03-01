package com.ruoyi.bomb.mapper;

import java.util.List;
import com.ruoyi.bomb.domain.BbWeekplanDtl;

/**
 * 周计划明细档Mapper接口
 * 
 * @author wq
 * @date 2022-03-01
 */
public interface BbWeekplanDtlMapper 
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
     * 删除周计划明细档
     * 
     * @param planDtlId 周计划明细档主键
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanDtlId(Long planDtlId);

    /**
     * 批量删除周计划明细档
     * 
     * @param planDtlIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBbWeekplanDtlByPlanDtlIds(String[] planDtlIds);
}
