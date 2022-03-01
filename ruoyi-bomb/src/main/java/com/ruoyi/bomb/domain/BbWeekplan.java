package com.ruoyi.bomb.domain;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 周计划主档对象 bb_weekplan
 * 
 * @author wq
 * @date 2022-03-01
 */
public class BbWeekplan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 周计划id */
    private Long planId;

    /** 计划单号 */
    @Excel(name = "计划单号")
    private String planNo;

    /** 申报日期 */
    @Excel(name = "申报日期")
    private String reqPlanDate;

    /** 申报人 */
    @Excel(name = "申报人")
    private String reqUserId;

    /** 申请单位 */
    @Excel(name = "申请单位")
    private String reqDeptNo;

    /** 炸药需求量(小号) */
    @Excel(name = "炸药需求量(小号)")
    private BigDecimal qtyBombSmall;

    /** 炸药需求量(大号) */
    @Excel(name = "炸药需求量(大号)")
    private BigDecimal qtyBombBig;

    /** 炸药需求量(总) */
    @Excel(name = "炸药需求量(总)")
    private BigDecimal qtyBombTotal;

    /** 技术负责人 */
    @Excel(name = "技术负责人")
    private String techUserId;

    /** 技术审核日期 */
    @Excel(name = "技术审核日期")
    private String techAffirmDate;

    /** 二级审核人 */
    @Excel(name = "二级审核人")
    private String balanceUserId;

    /** 二级审核日期 */
    @Excel(name = "二级审核日期")
    private String balanceAffirmDate;

    /** 单据状态 */
    @Excel(name = "单据状态")
    private String billStatus;

    /** 公司别id */
    private Long compId;

    /** 删除标志0存在2删除 */
    private String delFlag;

    /** 周计划明细档信息 */
    private List<BbWeekplanDtl> bbWeekplanDtlList;

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
    public void setReqPlanDate(String reqPlanDate) 
    {
        this.reqPlanDate = reqPlanDate;
    }

    public String getReqPlanDate() 
    {
        return reqPlanDate;
    }
    public void setReqUserId(String reqUserId) 
    {
        this.reqUserId = reqUserId;
    }

    public String getReqUserId() 
    {
        return reqUserId;
    }
    public void setReqDeptNo(String reqDeptNo) 
    {
        this.reqDeptNo = reqDeptNo;
    }

    public String getReqDeptNo() 
    {
        return reqDeptNo;
    }
    public void setQtyBombSmall(BigDecimal qtyBombSmall) 
    {
        this.qtyBombSmall = qtyBombSmall;
    }

    public BigDecimal getQtyBombSmall() 
    {
        return qtyBombSmall;
    }
    public void setQtyBombBig(BigDecimal qtyBombBig) 
    {
        this.qtyBombBig = qtyBombBig;
    }

    public BigDecimal getQtyBombBig() 
    {
        return qtyBombBig;
    }
    public void setQtyBombTotal(BigDecimal qtyBombTotal) 
    {
        this.qtyBombTotal = qtyBombTotal;
    }

    public BigDecimal getQtyBombTotal() 
    {
        return qtyBombTotal;
    }
    public void setTechUserId(String techUserId) 
    {
        this.techUserId = techUserId;
    }

    public String getTechUserId() 
    {
        return techUserId;
    }
    public void setTechAffirmDate(String techAffirmDate) 
    {
        this.techAffirmDate = techAffirmDate;
    }

    public String getTechAffirmDate() 
    {
        return techAffirmDate;
    }
    public void setBalanceUserId(String balanceUserId) 
    {
        this.balanceUserId = balanceUserId;
    }

    public String getBalanceUserId() 
    {
        return balanceUserId;
    }
    public void setBalanceAffirmDate(String balanceAffirmDate) 
    {
        this.balanceAffirmDate = balanceAffirmDate;
    }

    public String getBalanceAffirmDate() 
    {
        return balanceAffirmDate;
    }
    public void setBillStatus(String billStatus) 
    {
        this.billStatus = billStatus;
    }

    public String getBillStatus() 
    {
        return billStatus;
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

    public List<BbWeekplanDtl> getBbWeekplanDtlList()
    {
        return bbWeekplanDtlList;
    }

    public void setBbWeekplanDtlList(List<BbWeekplanDtl> bbWeekplanDtlList)
    {
        this.bbWeekplanDtlList = bbWeekplanDtlList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planId", getPlanId())
            .append("planNo", getPlanNo())
            .append("reqPlanDate", getReqPlanDate())
            .append("reqUserId", getReqUserId())
            .append("reqDeptNo", getReqDeptNo())
            .append("qtyBombSmall", getQtyBombSmall())
            .append("qtyBombBig", getQtyBombBig())
            .append("qtyBombTotal", getQtyBombTotal())
            .append("techUserId", getTechUserId())
            .append("techAffirmDate", getTechAffirmDate())
            .append("balanceUserId", getBalanceUserId())
            .append("balanceAffirmDate", getBalanceAffirmDate())
            .append("billStatus", getBillStatus())
            .append("compId", getCompId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("bbWeekplanDtlList", getBbWeekplanDtlList())
            .toString();
    }
}
