package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.common.core.domain.entity.SysComp;

/**
 * 公司别Service接口
 * 
 * @author wq
 * @date 2022-02-21
 */
public interface ISysCompService 
{
    /**
     * 查询公司别
     * 
     * @param compId 公司别主键
     * @return 公司别
     */
    public SysComp selectSysCompByCompId(Long compId);

    /**
     * 查询公司别列表
     * 
     * @param sysComp 公司别
     * @return 公司别集合
     */
    public List<SysComp> selectSysCompList(SysComp sysComp);

    /**
     * 新增公司别
     * 
     * @param sysComp 公司别
     * @return 结果
     */
    public int insertSysComp(SysComp sysComp);

    /**
     * 修改公司别
     * 
     * @param sysComp 公司别
     * @return 结果
     */
    public int updateSysComp(SysComp sysComp);

    /**
     * 批量删除公司别
     * 
     * @param compIds 需要删除的公司别主键集合
     * @return 结果
     */
    public int deleteSysCompByCompIds(String compIds);

    /**
     * 删除公司别信息
     * 
     * @param compId 公司别主键
     * @return 结果
     */
    public int deleteSysCompByCompId(Long compId);
}
