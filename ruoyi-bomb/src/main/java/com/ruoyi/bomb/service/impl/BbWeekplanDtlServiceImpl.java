package com.ruoyi.bomb.service.impl;

import java.util.List;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bomb.mapper.BbWeekplanDtlMapper;
import com.ruoyi.bomb.domain.BbWeekplanDtl;
import com.ruoyi.bomb.service.IBbWeekplanDtlService;
import com.ruoyi.common.core.text.Convert;

/**
 * 周计划明细档Service业务层处理
 * 
 * @author wq
 * @date 2022-03-01
 */
@Service
public class BbWeekplanDtlServiceImpl implements IBbWeekplanDtlService 
{
    @Autowired
    private BbWeekplanDtlMapper bbWeekplanDtlMapper;

    /**
     * 查询周计划明细档
     * 
     * @param planDtlId 周计划明细档主键
     * @return 周计划明细档
     */
    @Override
    public BbWeekplanDtl selectBbWeekplanDtlByPlanDtlId(Long planDtlId)
    {
        return bbWeekplanDtlMapper.selectBbWeekplanDtlByPlanDtlId(planDtlId);
    }

    /**
     * 查询周计划明细档列表
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 周计划明细档
     */
    @Override
    public List<BbWeekplanDtl> selectBbWeekplanDtlList(BbWeekplanDtl bbWeekplanDtl)
    {
        return bbWeekplanDtlMapper.selectBbWeekplanDtlList(bbWeekplanDtl);
    }

    /**
     * 新增周计划明细档
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 结果
     */
    @Override
    public int insertBbWeekplanDtl(BbWeekplanDtl bbWeekplanDtl)
    {
        SysUser curUser = ShiroUtils.getSysUser();
        bbWeekplanDtl.setCompId(curUser.getCompId());
        bbWeekplanDtl.setCreateBy(curUser.getUserName());
        bbWeekplanDtl.setCreateTime(DateUtils.getNowDate());
        return bbWeekplanDtlMapper.insertBbWeekplanDtl(bbWeekplanDtl);
    }

    /**
     * 修改周计划明细档
     * 
     * @param bbWeekplanDtl 周计划明细档
     * @return 结果
     */
    @Override
    public int updateBbWeekplanDtl(BbWeekplanDtl bbWeekplanDtl)
    {
        SysUser curUser = ShiroUtils.getSysUser();
        bbWeekplanDtl.setCompId(curUser.getCompId());
        bbWeekplanDtl.setCreateBy(curUser.getUserName());
        bbWeekplanDtl.setUpdateTime(DateUtils.getNowDate());
        return bbWeekplanDtlMapper.updateBbWeekplanDtl(bbWeekplanDtl);
    }

    /**
     * 批量删除周计划明细档
     * 
     * @param planDtlIds 需要删除的周计划明细档主键
     * @return 结果
     */
    @Override
    public int deleteBbWeekplanDtlByPlanDtlIds(String planDtlIds)
    {
        return bbWeekplanDtlMapper.deleteBbWeekplanDtlByPlanDtlIds(Convert.toStrArray(planDtlIds));
    }

    /**
     * 删除周计划明细档信息
     * 
     * @param planDtlId 周计划明细档主键
     * @return 结果
     */
    @Override
    public int deleteBbWeekplanDtlByPlanDtlId(Long planDtlId)
    {
        return bbWeekplanDtlMapper.deleteBbWeekplanDtlByPlanDtlId(planDtlId);
    }
}
