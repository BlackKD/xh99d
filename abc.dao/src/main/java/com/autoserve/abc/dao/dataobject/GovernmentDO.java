package com.autoserve.abc.dao.dataobject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 机构信息
 *
 * @author RJQ 2014/11/13 18:10.
 */
public class GovernmentDO {
    /**
     * abc_government.gov_id
     */
    private Integer govId;

    /**
     * 机构名称
     * abc_government.gov_name
     */
    private String govName;

    /**
     * 公司邮箱
     * abc_government.gov_email
     */
    private String govEmail;

    /**
     * 组织机构代码
     * abc_government.gov_no
     */
    private String govNo;

    /**
     * 营业执照号码
     * abc_government.gov_business_license
     */
    private String govBusinessLicense;

    /**
     * 企业规模	"0:50人以下
     * 1:50~500人
     * 2:500人以上"
     * abc_government.gov_scale
     */
    private Integer govScale;

    /**
     * 注册资金
     * abc_government.gov_register_capital
     */
    private BigDecimal govRegisterCapital;

    /**
     * 资产总额
     * abc_government.gov_total_capital
     */
    private BigDecimal govTotalCapital;

    /**
     * 最大借款额度
     * abc_government.gov_max_loan_amount
     */
    private BigDecimal govMaxLoanAmount;

    /**
     * 注册地行政区划
     * abc_government.gov_register_division
     */
    private String govRegisterDivision;

    /**
     * 注册地址
     * abc_government.gov_register_address
     */
    private String govRegisterAddress;

    /**
     * 注册日期
     * abc_government.gov_register_date
     */
    private Date govRegisterDate;

    /**
     * 联系人
     * abc_government.gov_contact
     */
    private String govContact;

    /**
     * 联系电话
     * abc_government.gov_contact_phone
     */
    private String govContactPhone;

    /**
     * 客户经理
     * abc_government.gov_customer_manager
     */
    private Integer govCustomerManager;

    /**
     * 法定代表人
     * abc_government.gov_corporate
     */
    private String govCorporate;

    /**
     * 证件类型
     * abc_government.gov_doc_type
     */
    private String govDocType;

    /**
     * 证件号码
     * abc_government.gov_doc_no
     */
    private String govDocNo;

    /**
     * 信用级别
     * abc_government.gov_credit_level
     */
    private String govCreditLevel;

    /**
     * 所属地区
     * abc_government.gov_area
     */
    private String govArea;

    /**
     * 详细地址
     * abc_government.gov_address_detail
     */
    private String govAddressDetail;

    /**
     * 是否提供担保	1：是 0：否
     * abc_government.gov_is_offer_guar
     */
    private Integer govIsOfferGuar;

    /**
     * 最大担保额度
     * abc_government.gov_max_guar_amount
     */
    private BigDecimal govMaxGuarAmount;

    /**
     * 可用担保额度
     * abc_government.gov_sett_guar_amount
     */
    private BigDecimal govSettGuarAmount;

    /**
     * 机构logo图片
     * abc_government.gov_logo
     */
    private String govLogo;

    /**
     * 是否启用	1：启用 0：停用 2 : 已删除
     * abc_government.gov_is_enable
     */
    private Integer govIsEnable;

    /**
     * 机构状态	0：待审核 1：审核已通过 2：审核未通过
     * abc_government.gov_state
     */
    private Integer govState;

    /**
     * 审核人
     * abc_government.gov_reviewer
     */
    private Integer govReviewer;

    /**
     * 审核日期
     * abc_government.gov_review_date
     */
    private Date govReviewDate;

    /**
     * 添加人
     * abc_government.gov_add_emp
     */
    private Integer govAddEmp;

    /**
     * 添加日期
     * abc_government.gov_add_date
     */
    private Date govAddDate;

    /**
     * 公司概况
     * abc_government.gov_profile
     */
    private String govProfile;

    /**
     * 团队管理
     * abc_government.gov_team_management
     */
    private String govTeamManagement;

    /**
     * 发展历史
     * abc_government.gov_development_history
     */
    private String govDevelopmentHistory;

    /**
     * 融资性担保牌照
     * abc_government.gov_guar_card
     */
    private String govGuarCard;

    /**
     * 合作机构
     * abc_government.gov_partner
     */
    private String govPartner;

    /**
     * 外部交易流水號
     * abc_government.gov_out_seq_no
     */
    private String govOutSeqNo;
    /**
     * 合作协议
     * abc_government.gov_cooperate_agreement
     */
    private String govCooperateAgreement;

    private Date govLastModifyTime;

    public Date getGovLastModifyTime() {
        return govLastModifyTime;
    }

    public void setGovLastModifyTime(Date govLastModifyTime) {
        this.govLastModifyTime = govLastModifyTime;
    }

    public Integer getGovId() {
        return govId;
    }

    public void setGovId(Integer govId) {
        this.govId = govId;
    }

    public String getGovName() {
        return govName;
    }

    public void setGovName(String govName) {
        this.govName = govName;
    }

    public String getGovEmail() {
        return govEmail;
    }

    public void setGovEmail(String govEmail) {
        this.govEmail = govEmail;
    }

    public String getGovNo() {
        return govNo;
    }

    public void setGovNo(String govNo) {
        this.govNo = govNo;
    }

    public String getGovBusinessLicense() {
        return govBusinessLicense;
    }

    public void setGovBusinessLicense(String govBusinessLicense) {
        this.govBusinessLicense = govBusinessLicense;
    }

    public Integer getGovScale() {
        return govScale;
    }

    public void setGovScale(Integer govScale) {
        this.govScale = govScale;
    }

    public BigDecimal getGovRegisterCapital() {
        return govRegisterCapital;
    }

    public void setGovRegisterCapital(BigDecimal govRegisterCapital) {
        this.govRegisterCapital = govRegisterCapital;
    }

    public BigDecimal getGovTotalCapital() {
        return govTotalCapital;
    }

    public void setGovTotalCapital(BigDecimal govTotalCapital) {
        this.govTotalCapital = govTotalCapital;
    }

    public BigDecimal getGovMaxLoanAmount() {
        return govMaxLoanAmount;
    }

    public void setGovMaxLoanAmount(BigDecimal govMaxLoanAmount) {
        this.govMaxLoanAmount = govMaxLoanAmount;
    }

    public String getGovRegisterDivision() {
        return govRegisterDivision;
    }

    public void setGovRegisterDivision(String govRegisterDivision) {
        this.govRegisterDivision = govRegisterDivision;
    }

    public String getGovRegisterAddress() {
        return govRegisterAddress;
    }

    public void setGovRegisterAddress(String govRegisterAddress) {
        this.govRegisterAddress = govRegisterAddress;
    }

    public Date getGovRegisterDate() {
        return govRegisterDate;
    }

    public void setGovRegisterDate(Date govRegisterDate) {
        this.govRegisterDate = govRegisterDate;
    }

    public String getGovContact() {
        return govContact;
    }

    public void setGovContact(String govContact) {
        this.govContact = govContact;
    }

    public String getGovContactPhone() {
        return govContactPhone;
    }

    public void setGovContactPhone(String govContactPhone) {
        this.govContactPhone = govContactPhone;
    }

    public Integer getGovCustomerManager() {
        return govCustomerManager;
    }

    public void setGovCustomerManager(Integer govCustomerManager) {
        this.govCustomerManager = govCustomerManager;
    }

    public String getGovCorporate() {
        return govCorporate;
    }

    public void setGovCorporate(String govCorporate) {
        this.govCorporate = govCorporate;
    }

    public String getGovDocType() {
        return govDocType;
    }

    public void setGovDocType(String govDocType) {
        this.govDocType = govDocType;
    }

    public String getGovDocNo() {
        return govDocNo;
    }

    public void setGovDocNo(String govDocNo) {
        this.govDocNo = govDocNo;
    }

    public String getGovCreditLevel() {
        return govCreditLevel;
    }

    public void setGovCreditLevel(String govCreditLevel) {
        this.govCreditLevel = govCreditLevel;
    }

    public String getGovArea() {
        return govArea;
    }

    public void setGovArea(String govArea) {
        this.govArea = govArea;
    }

    public String getGovAddressDetail() {
        return govAddressDetail;
    }

    public void setGovAddressDetail(String govAddressDetail) {
        this.govAddressDetail = govAddressDetail;
    }

    public Integer getGovIsOfferGuar() {
        return govIsOfferGuar;
    }

    public void setGovIsOfferGuar(Integer govIsOfferGuar) {
        this.govIsOfferGuar = govIsOfferGuar;
    }

    public BigDecimal getGovMaxGuarAmount() {
        return govMaxGuarAmount;
    }

    public void setGovMaxGuarAmount(BigDecimal govMaxGuarAmount) {
        this.govMaxGuarAmount = govMaxGuarAmount;
    }

    public BigDecimal getGovSettGuarAmount() {
        return govSettGuarAmount;
    }

    public void setGovSettGuarAmount(BigDecimal govSettGuarAmount) {
        this.govSettGuarAmount = govSettGuarAmount;
    }

    public String getGovLogo() {
        return govLogo;
    }

    public void setGovLogo(String govLogo) {
        this.govLogo = govLogo;
    }

    public Integer getGovIsEnable() {
        return govIsEnable;
    }

    public void setGovIsEnable(Integer govIsEnable) {
        this.govIsEnable = govIsEnable;
    }

    public Integer getGovState() {
        return govState;
    }

    public void setGovState(Integer govState) {
        this.govState = govState;
    }

    public Integer getGovReviewer() {
        return govReviewer;
    }

    public void setGovReviewer(Integer govReviewer) {
        this.govReviewer = govReviewer;
    }

    public Date getGovReviewDate() {
        return govReviewDate;
    }

    public void setGovReviewDate(Date govReviewDate) {
        this.govReviewDate = govReviewDate;
    }

    public Integer getGovAddEmp() {
        return govAddEmp;
    }

    public void setGovAddEmp(Integer govAddEmp) {
        this.govAddEmp = govAddEmp;
    }

    public Date getGovAddDate() {
        return govAddDate;
    }

    public void setGovAddDate(Date govAddDate) {
        this.govAddDate = govAddDate;
    }

    public String getGovProfile() {
        return govProfile;
    }

    public void setGovProfile(String govProfile) {
        this.govProfile = govProfile;
    }

    public String getGovTeamManagement() {
        return govTeamManagement;
    }

    public void setGovTeamManagement(String govTeamManagement) {
        this.govTeamManagement = govTeamManagement;
    }

    public String getGovDevelopmentHistory() {
        return govDevelopmentHistory;
    }

    public void setGovDevelopmentHistory(String govDevelopmentHistory) {
        this.govDevelopmentHistory = govDevelopmentHistory;
    }

    public String getGovGuarCard() {
        return govGuarCard;
    }

    public void setGovGuarCard(String govGuarCard) {
        this.govGuarCard = govGuarCard;
    }

    public String getGovPartner() {
        return govPartner;
    }

    public void setGovPartner(String govPartner) {
        this.govPartner = govPartner;
    }

    public String getGovCooperateAgreement() {
        return govCooperateAgreement;
    }

    public void setGovCooperateAgreement(String govCooperateAgreement) {
        this.govCooperateAgreement = govCooperateAgreement;
    }

	public String getGovOutSeqNo() {
		return govOutSeqNo;
	}

	public void setGovOutSeqNo(String govOutSeqNo) {
		this.govOutSeqNo = govOutSeqNo;
	}
    
}
