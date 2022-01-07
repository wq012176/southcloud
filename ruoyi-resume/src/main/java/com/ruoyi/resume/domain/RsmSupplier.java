package com.ruoyi.resume.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商主档对象 rsm_supplier
 * 
 * @author wq
 * @date 2021-11-16
 */
public class RsmSupplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 租户号 */
    @Excel(name = "租户号")
    private String tenantId;

    /** 乐观锁 */
    @Excel(name = "乐观锁")
    private String REVISION;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    /** 供应商编码 */
    private String supplierId;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 税号 */
    @Excel(name = "税号")
    private String taxId;

    /** 供应商简称 */
    @Excel(name = "供应商简称")
    private String supplierNameSimple;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    public void setTenantId(String tenantId) 
    {
        this.tenantId = tenantId;
    }

    public String getTenantId() 
    {
        return tenantId;
    }
    public void setREVISION(String REVISION) 
    {
        this.REVISION = REVISION;
    }

    public String getREVISION() 
    {
        return REVISION;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setTaxId(String taxId) 
    {
        this.taxId = taxId;
    }

    public String getTaxId() 
    {
        return taxId;
    }
    public void setSupplierNameSimple(String supplierNameSimple) 
    {
        this.supplierNameSimple = supplierNameSimple;
    }

    public String getSupplierNameSimple() 
    {
        return supplierNameSimple;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tenantId", getTenantId())
            .append("REVISION", getREVISION())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .append("supplierId", getSupplierId())
            .append("supplierName", getSupplierName())
            .append("taxId", getTaxId())
            .append("supplierNameSimple", getSupplierNameSimple())
            .append("status", getStatus())
            .toString();
    }
}
