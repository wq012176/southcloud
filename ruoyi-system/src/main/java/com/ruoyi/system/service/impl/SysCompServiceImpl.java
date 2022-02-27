package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCompMapper;
import com.ruoyi.common.core.domain.entity.SysComp;
import com.ruoyi.system.service.ISysCompService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司别Service业务层处理
 * 
 * @author wq
 * @date 2022-02-21
 */
@Service
public class SysCompServiceImpl implements ISysCompService 
{
    @Autowired
    private SysCompMapper sysCompMapper;

    /**
     * 查询公司别
     * 
     * @param compId 公司别主键
     * @return 公司别
     */
    @Override
    public SysComp selectSysCompByCompId(Long compId)
    {
        return sysCompMapper.selectSysCompByCompId(compId);
    }

    /**
     * 查询公司别列表
     * 
     * @param sysComp 公司别
     * @return 公司别
     */
    @Override
    public List<SysComp> selectSysCompList(SysComp sysComp)
    {
        return sysCompMapper.selectSysCompList(sysComp);
    }

    /**
     * 新增公司别
     * 
     * @param sysComp 公司别
     * @return 结果
     */
    @Override
    public int insertSysComp(SysComp sysComp)
    {
        sysComp.setCreateTime(DateUtils.getNowDate());
        return sysCompMapper.insertSysComp(sysComp);
    }

    /**
     * 修改公司别
     * 
     * @param sysComp 公司别
     * @return 结果
     */
    @Override
    public int updateSysComp(SysComp sysComp)
    {
        sysComp.setUpdateTime(DateUtils.getNowDate());
        return sysCompMapper.updateSysComp(sysComp);
    }

    /**
     * 批量删除公司别
     * 
     * @param compIds 需要删除的公司别主键
     * @return 结果
     */
    @Override
    public int deleteSysCompByCompIds(String compIds)
    {
        return sysCompMapper.deleteSysCompByCompIds(Convert.toStrArray(compIds));
    }

    /**
     * 删除公司别信息
     * 
     * @param compId 公司别主键
     * @return 结果
     */
    @Override
    public int deleteSysCompByCompId(Long compId)
    {
        return sysCompMapper.deleteSysCompByCompId(compId);
    }
}
