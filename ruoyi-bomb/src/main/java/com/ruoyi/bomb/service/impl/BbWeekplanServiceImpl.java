package com.ruoyi.bomb.service.impl;

import java.util.List;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.bomb.domain.BbWeekplanDtl;
import com.ruoyi.bomb.mapper.BbWeekplanMapper;
import com.ruoyi.bomb.domain.BbWeekplan;
import com.ruoyi.bomb.service.IBbWeekplanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 周计划主档Service业务层处理
 * 
 * @author wq
 * @date 2022-03-01
 */
@Service
public class BbWeekplanServiceImpl implements IBbWeekplanService 
{
    @Autowired
    private BbWeekplanMapper bbWeekplanMapper;

    /**
     * 查询周计划主档
     * 
     * @param planId 周计划主档主键
     * @return 周计划主档
     */
    @Override
    public BbWeekplan selectBbWeekplanByPlanId(Long planId)
    {
        return bbWeekplanMapper.selectBbWeekplanByPlanId(planId);
    }

    /**
     * 查询周计划主档列表
     * 
     * @param bbWeekplan 周计划主档
     * @return 周计划主档
     */
    @Override
    public List<BbWeekplan> selectBbWeekplanList(BbWeekplan bbWeekplan)
    {
        return bbWeekplanMapper.selectBbWeekplanList(bbWeekplan);
    }

    /**
     * 新增周计划主档
     * 
     * @param bbWeekplan 周计划主档
     * @return 结果
     */
    @Transactional
    @Override
    public int insertBbWeekplan(BbWeekplan bbWeekplan)
    {
        SysUser curUser = ShiroUtils.getSysUser();
        bbWeekplan.setCompId(curUser.getCompId());
        bbWeekplan.setCreateBy(curUser.getUserName());
        bbWeekplan.setCreateTime(DateUtils.getNowDate());
        int rows = bbWeekplanMapper.insertBbWeekplan(bbWeekplan);
        insertBbWeekplanDtl(bbWeekplan, curUser);
        return rows;
    }

    /**
     * 修改周计划主档
     * 
     * @param bbWeekplan 周计划主档
     * @return 结果
     */
    @Transactional
    @Override
    public int updateBbWeekplan(BbWeekplan bbWeekplan)
    {
        SysUser curUser = ShiroUtils.getSysUser();
        bbWeekplan.setCompId(curUser.getCompId());
        bbWeekplan.setCreateBy(curUser.getUserName());
        bbWeekplan.setUpdateTime(DateUtils.getNowDate());
        bbWeekplanMapper.deleteBbWeekplanDtlByPlanId(bbWeekplan.getPlanId());
        insertBbWeekplanDtl(bbWeekplan, curUser);
        return bbWeekplanMapper.updateBbWeekplan(bbWeekplan);
    }

    /**
     * 批量删除周计划主档
     * 
     * @param planIds 需要删除的周计划主档主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBbWeekplanByPlanIds(String planIds)
    {
        bbWeekplanMapper.deleteBbWeekplanDtlByPlanIds(Convert.toStrArray(planIds));
        return bbWeekplanMapper.deleteBbWeekplanByPlanIds(Convert.toStrArray(planIds));
    }

    /**
     * 删除周计划主档信息
     * 
     * @param planId 周计划主档主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBbWeekplanByPlanId(Long planId)
    {
        bbWeekplanMapper.deleteBbWeekplanDtlByPlanId(planId);
        return bbWeekplanMapper.deleteBbWeekplanByPlanId(planId);
    }

    /**
     * 新增周计划明细档信息
     * 
     * @param bbWeekplan 周计划主档对象
     */
    public void insertBbWeekplanDtl(BbWeekplan bbWeekplan, SysUser curUser)
    {
        List<BbWeekplanDtl> bbWeekplanDtlList = bbWeekplan.getBbWeekplanDtlList();
        Long planId = bbWeekplan.getPlanId();
        if (StringUtils.isNotNull(bbWeekplanDtlList))
        {
            List<BbWeekplanDtl> list = new ArrayList<BbWeekplanDtl>();
            for (BbWeekplanDtl bbWeekplanDtl : bbWeekplanDtlList)
            {
                bbWeekplanDtl.setPlanId(planId);
                bbWeekplanDtl.setCompId(curUser.getCompId());
                bbWeekplanDtl.setCreateBy(curUser.getUserName());
                bbWeekplanDtl.setCreateTime(DateUtils.getNowDate());
                list.add(bbWeekplanDtl);
            }
            if (list.size() > 0)
            {
                bbWeekplanMapper.batchBbWeekplanDtl(list);
            }
        }
    }
}
