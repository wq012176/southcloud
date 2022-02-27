package com.ruoyi.common.core.domain.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公司别对象 sys_comp
 * 
 * @author wq
 * @date 2022-02-21
 */
public class SysComp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公司别id */
    private Long compId;

    /* 公司简称 */
    @Excel(name = "公司简称")
    private String compNameShort;

    /** 公司全称 */
    @Excel(name = "公司全称")
    private String compName;

    /** 纳税人识别号 */
    @Excel(name = "纳税人识别号")
    private String taxNo;

    /** 地址 */
    @Excel(name = "地址")
    private String addr;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankName;

    /** 开户行账号 */
    @Excel(name = "开户行账号")
    private String accountNo;

    /** 删除标志0存在2删除 */
    private String delFlag;

    public void setCompId(Long compId) 
    {
        this.compId = compId;
    }

    public Long getCompId() 
    {
        return compId;
    }
    public void setCompName(String compName) 
    {
        this.compName = compName;
    }

    public String getCompName() 
    {
        return compName;
    }
    public void setTaxNo(String taxNo) 
    {
        this.taxNo = taxNo;
    }

    public String getTaxNo() 
    {
        return taxNo;
    }
    public void setAddr(String addr) 
    {
        this.addr = addr;
    }

    public String getAddr() 
    {
        return addr;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setAccountNo(String accountNo) 
    {
        this.accountNo = accountNo;
    }

    public String getAccountNo() 
    {
        return accountNo;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    public String getCompNameShort() {
        return compNameShort;
    }

    public void setCompNameShort(String compNameShort) {
        this.compNameShort = compNameShort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("compId", getCompId())
            .append("compNameShort", getCompNameShort())
            .append("compName", getCompName())
            .append("taxNo", getTaxNo())
            .append("addr", getAddr())
            .append("phone", getPhone())
            .append("bankName", getBankName())
            .append("accountNo", getAccountNo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .toString();
    }
}
