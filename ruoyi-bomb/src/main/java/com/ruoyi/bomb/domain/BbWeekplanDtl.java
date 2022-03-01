package com.ruoyi.bomb.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 周计划明细档对象 bb_weekplan_dtl
 * 
 * @author wq
 * @date 2022-03-01
 */
public class BbWeekplanDtl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 周计划明细id */
    private Long planDtlId;

    /** 周计划id */
    @Excel(name = "周计划id")
    private Long planId;

    /** 计划单号 */
    @Excel(name = "计划单号")
    private String planNo;

    /** 明细项次号 */
    @Excel(name = "明细项次号")
    private String planItemNo;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String mtrlNo;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String mtrlName;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String spec;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String unit;

    /** 周计划量 */
    @Excel(name = "周计划量")
    private BigDecimal qtyPlanWeek;

    /** 周一计划量 */
    @Excel(name = "周一计划量")
    private BigDecimal qtyPlanMon;

    /** 周二计划量 */
    @Excel(name = "周二计划量")
    private BigDecimal qtyPlanTue;

    /** 周三计划量 */
    @Excel(name = "周三计划量")
    private BigDecimal qtyPlanWed;

    /** 周四计划量 */
    @Excel(name = "周四计划量")
    private BigDecimal qtyPlanThu;

    /** 周五计划量 */
    @Excel(name = "周五计划量")
    private BigDecimal qtyPlanFri;

    /** 周六计划量 */
    @Excel(name = "周六计划量")
    private BigDecimal qtyPlanSat;

    /** 周日计划量 */
    @Excel(name = "周日计划量")
    private BigDecimal qtyPlanSun;

    /** 公司别id */
    private Long compId;

    /** 删除标志0存在2删除 */
    private String delFlag;

    public void setPlanDtlId(Long planDtlId) 
    {
        this.planDtlId = planDtlId;
    }

    public Long getPlanDtlId() 
    {
        return planDtlId;
    }
    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setPlanNo(String planNo) 
    {
        this.planNo = planNo;
    }

    public String getPlanNo() 
    {
        return planNo;
    }
    public void setPlanItemNo(String planItemNo) 
    {
        this.planItemNo = planItemNo;
    }

    public String getPlanItemNo() 
    {
        return planItemNo;
    }
    public void setMtrlNo(String mtrlNo) 
    {
        this.mtrlNo = mtrlNo;
    }

    public String getMtrlNo() 
    {
        return mtrlNo;
    }
    public void setMtrlName(String mtrlName) 
    {
        this.mtrlName = mtrlName;
    }

    public String getMtrlName() 
    {
        return mtrlName;
    }
    public void setSpec(String spec) 
    {
        this.spec = spec;
    }

    public String getSpec() 
    {
        return spec;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setQtyPlanWeek(BigDecimal qtyPlanWeek) 
    {
        this.qtyPlanWeek = qtyPlanWeek;
    }

    public BigDecimal getQtyPlanWeek() 
    {
        return qtyPlanWeek;
    }
    public void setQtyPlanMon(BigDecimal qtyPlanMon) 
    {
        this.qtyPlanMon = qtyPlanMon;
    }

    public BigDecimal getQtyPlanMon() 
    {
        return qtyPlanMon;
    }
    public void setQtyPlanTue(BigDecimal qtyPlanTue) 
    {
        this.qtyPlanTue = qtyPlanTue;
    }

    public BigDecimal getQtyPlanTue() 
    {
        return qtyPlanTue;
    }
    public void setQtyPlanWed(BigDecimal qtyPlanWed) 
    {
        this.qtyPlanWed = qtyPlanWed;
    }

    public BigDecimal getQtyPlanWed() 
    {
        return qtyPlanWed;
    }
    public void setQtyPlanThu(BigDecimal qtyPlanThu) 
    {
        this.qtyPlanThu = qtyPlanThu;
    }

    public BigDecimal getQtyPlanThu() 
    {
        return qtyPlanThu;
    }
    public void setQtyPlanFri(BigDecimal qtyPlanFri) 
    {
        this.qtyPlanFri = qtyPlanFri;
    }

    public BigDecimal getQtyPlanFri() 
    {
        return qtyPlanFri;
    }
    public void setQtyPlanSat(BigDecimal qtyPlanSat) 
    {
        this.qtyPlanSat = qtyPlanSat;
    }

    public BigDecimal getQtyPlanSat() 
    {
        return qtyPlanSat;
    }
    public void setQtyPlanSun(BigDecimal qtyPlanSun) 
    {
        this.qtyPlanSun = qtyPlanSun;
    }

    public BigDecimal getQtyPlanSun() 
    {
        return qtyPlanSun;
    }
    public void setCompId(Long compId) 
    {
        this.compId = compId;
    }

    public Long getCompId() 
    {
        return compId;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planDtlId", getPlanDtlId())
            .append("planId", getPlanId())
            .append("planNo", getPlanNo())
            .append("planItemNo", getPlanItemNo())
            .append("mtrlNo", getMtrlNo())
            .append("mtrlName", getMtrlName())
            .append("spec", getSpec())
            .append("unit", getUnit())
            .append("qtyPlanWeek", getQtyPlanWeek())
            .append("qtyPlanMon", getQtyPlanMon())
            .append("qtyPlanTue", getQtyPlanTue())
            .append("qtyPlanWed", getQtyPlanWed())
            .append("qtyPlanThu", getQtyPlanThu())
            .append("qtyPlanFri", getQtyPlanFri())
            .append("qtyPlanSat", getQtyPlanSat())
            .append("qtyPlanSun", getQtyPlanSun())
            .append("compId", getCompId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .toString();
    }
}
