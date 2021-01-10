package com.ruoyi.am.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应用账密对象 t_account
 * 
 * @author ruoyi
 * @date 2021-01-10
 */
public class TAccount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 账号ID */
    private Long iId;

    /** 外键ID-关联sys_user表 */
    @Excel(name = "外键ID-关联sys_user表")
    private Long iUserId;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String sAppname;

    /** 应用站点1 */
    @Excel(name = "应用站点1")
    private String sSite1;

    /** 应用站点2 */
    @Excel(name = "应用站点2")
    private String sSite2;

    /** 应用站点3 */
    @Excel(name = "应用站点3")
    private String sSite3;

    /** 登录账号 */
    @Excel(name = "登录账号")
    private String sUsername;

    /** 登录密码 */
    @Excel(name = "登录密码")
    private String sPassword;

    /** 查询密码 */
    @Excel(name = "查询密码")
    private String sQueryPwd;

    /** 取款密码 */
    @Excel(name = "取款密码")
    private String sAtmPwd;

    /** 支付密码 */
    @Excel(name = "支付密码")
    private String sPayPwd;

    /** 图形密码 */
    @Excel(name = "图形密码")
    private String sGraphicPwd;

    /** 指纹密码 */
    @Excel(name = "指纹密码")
    private String sFingerPwd;

    /** 绑定邮箱 */
    @Excel(name = "绑定邮箱")
    private String sEmail;

    /** 绑定手机 */
    @Excel(name = "绑定手机")
    private String sPhone;

    /** 绑定身份证号 */
    @Excel(name = "绑定身份证号")
    private String sIdcardNum;

    /** 绑定身份证名 */
    @Excel(name = "绑定身份证名")
    private String sIdcardName;

    /** 密码提示问题1 */
    @Excel(name = "密码提示问题1")
    private String sQuestion1;

    /** 密码提示答案1 */
    @Excel(name = "密码提示答案1")
    private String sAnswer1;

    /** 密码提示问题2 */
    @Excel(name = "密码提示问题2")
    private String sQuestion2;

    /** 密码提示答案2 */
    @Excel(name = "密码提示答案2")
    private String sAnswer2;

    /** 密码提示问题3 */
    @Excel(name = "密码提示问题3")
    private String sQuestion3;

    /** 密码提示答案3 */
    @Excel(name = "密码提示答案3")
    private String sAnswer3;

    /** 备注 */
    @Excel(name = "备注")
    private String sRemark;

    /** 最后修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dUpdateTime;

    public void setiId(Long iId) 
    {
        this.iId = iId;
    }

    public Long getiId() 
    {
        return iId;
    }
    public void setiUserId(Long iUserId) 
    {
        this.iUserId = iUserId;
    }

    public Long getiUserId() 
    {
        return iUserId;
    }
    public void setsAppname(String sAppname) 
    {
        this.sAppname = sAppname;
    }

    public String getsAppname() 
    {
        return sAppname;
    }
    public void setsSite1(String sSite1) 
    {
        this.sSite1 = sSite1;
    }

    public String getsSite1() 
    {
        return sSite1;
    }
    public void setsSite2(String sSite2) 
    {
        this.sSite2 = sSite2;
    }

    public String getsSite2() 
    {
        return sSite2;
    }
    public void setsSite3(String sSite3) 
    {
        this.sSite3 = sSite3;
    }

    public String getsSite3() 
    {
        return sSite3;
    }
    public void setsUsername(String sUsername) 
    {
        this.sUsername = sUsername;
    }

    public String getsUsername() 
    {
        return sUsername;
    }
    public void setsPassword(String sPassword) 
    {
        this.sPassword = sPassword;
    }

    public String getsPassword() 
    {
        return sPassword;
    }
    public void setsQueryPwd(String sQueryPwd) 
    {
        this.sQueryPwd = sQueryPwd;
    }

    public String getsQueryPwd() 
    {
        return sQueryPwd;
    }
    public void setsAtmPwd(String sAtmPwd) 
    {
        this.sAtmPwd = sAtmPwd;
    }

    public String getsAtmPwd() 
    {
        return sAtmPwd;
    }
    public void setsPayPwd(String sPayPwd) 
    {
        this.sPayPwd = sPayPwd;
    }

    public String getsPayPwd() 
    {
        return sPayPwd;
    }
    public void setsGraphicPwd(String sGraphicPwd) 
    {
        this.sGraphicPwd = sGraphicPwd;
    }

    public String getsGraphicPwd() 
    {
        return sGraphicPwd;
    }
    public void setsFingerPwd(String sFingerPwd) 
    {
        this.sFingerPwd = sFingerPwd;
    }

    public String getsFingerPwd() 
    {
        return sFingerPwd;
    }
    public void setsEmail(String sEmail) 
    {
        this.sEmail = sEmail;
    }

    public String getsEmail() 
    {
        return sEmail;
    }
    public void setsPhone(String sPhone) 
    {
        this.sPhone = sPhone;
    }

    public String getsPhone() 
    {
        return sPhone;
    }
    public void setsIdcardNum(String sIdcardNum) 
    {
        this.sIdcardNum = sIdcardNum;
    }

    public String getsIdcardNum() 
    {
        return sIdcardNum;
    }
    public void setsIdcardName(String sIdcardName) 
    {
        this.sIdcardName = sIdcardName;
    }

    public String getsIdcardName() 
    {
        return sIdcardName;
    }
    public void setsQuestion1(String sQuestion1) 
    {
        this.sQuestion1 = sQuestion1;
    }

    public String getsQuestion1() 
    {
        return sQuestion1;
    }
    public void setsAnswer1(String sAnswer1) 
    {
        this.sAnswer1 = sAnswer1;
    }

    public String getsAnswer1() 
    {
        return sAnswer1;
    }
    public void setsQuestion2(String sQuestion2) 
    {
        this.sQuestion2 = sQuestion2;
    }

    public String getsQuestion2() 
    {
        return sQuestion2;
    }
    public void setsAnswer2(String sAnswer2) 
    {
        this.sAnswer2 = sAnswer2;
    }

    public String getsAnswer2() 
    {
        return sAnswer2;
    }
    public void setsQuestion3(String sQuestion3) 
    {
        this.sQuestion3 = sQuestion3;
    }

    public String getsQuestion3() 
    {
        return sQuestion3;
    }
    public void setsAnswer3(String sAnswer3) 
    {
        this.sAnswer3 = sAnswer3;
    }

    public String getsAnswer3() 
    {
        return sAnswer3;
    }
    public void setsRemark(String sRemark) 
    {
        this.sRemark = sRemark;
    }

    public String getsRemark() 
    {
        return sRemark;
    }
    public void setdUpdateTime(Date dUpdateTime) 
    {
        this.dUpdateTime = dUpdateTime;
    }

    public Date getdUpdateTime() 
    {
        return dUpdateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("iId", getiId())
            .append("iUserId", getiUserId())
            .append("sAppname", getsAppname())
            .append("sSite1", getsSite1())
            .append("sSite2", getsSite2())
            .append("sSite3", getsSite3())
            .append("sUsername", getsUsername())
            .append("sPassword", getsPassword())
            .append("sQueryPwd", getsQueryPwd())
            .append("sAtmPwd", getsAtmPwd())
            .append("sPayPwd", getsPayPwd())
            .append("sGraphicPwd", getsGraphicPwd())
            .append("sFingerPwd", getsFingerPwd())
            .append("sEmail", getsEmail())
            .append("sPhone", getsPhone())
            .append("sIdcardNum", getsIdcardNum())
            .append("sIdcardName", getsIdcardName())
            .append("sQuestion1", getsQuestion1())
            .append("sAnswer1", getsAnswer1())
            .append("sQuestion2", getsQuestion2())
            .append("sAnswer2", getsAnswer2())
            .append("sQuestion3", getsQuestion3())
            .append("sAnswer3", getsAnswer3())
            .append("sRemark", getsRemark())
            .append("dUpdateTime", getdUpdateTime())
            .toString();
    }
}
