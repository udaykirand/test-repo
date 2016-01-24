package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FORCE_PWD_CHANGE")
	private byte forcePwdChange;

	@Column(name="INVALID_ATTEMPTS")
	private int invalidAttempts;

	@Column(name="IS_PWD_EXPIRED")
	private byte isPwdExpired;

	@Column(name="IS_USER_LOCKED")
	private byte isUserLocked;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_LOGIN_AT")
	private Date lastLoginAt;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LAST_PASSWORD_CHANGED_AT")
	private Timestamp lastPasswordChangedAt;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="PHONE")
	private int phone;

	@Column(name="STATUSUSER")
	private byte statususer;

	@Column(name="UPDATED_BY")
	private int updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_ON")
	private Date updatedOn;

	@Column(name="USER_NAME")
	private String userName;

	//bi-directional many-to-one association to AccountForgotPassword
	@OneToMany(mappedBy="user")
	private List<AccountForgotPassword> accountForgotPasswords;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public byte getForcePwdChange() {
		return this.forcePwdChange;
	}

	public void setForcePwdChange(byte forcePwdChange) {
		this.forcePwdChange = forcePwdChange;
	}

	public int getInvalidAttempts() {
		return this.invalidAttempts;
	}

	public void setInvalidAttempts(int invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}

	public byte getIsPwdExpired() {
		return this.isPwdExpired;
	}

	public void setIsPwdExpired(byte isPwdExpired) {
		this.isPwdExpired = isPwdExpired;
	}

	public byte getIsUserLocked() {
		return this.isUserLocked;
	}

	public void setIsUserLocked(byte isUserLocked) {
		this.isUserLocked = isUserLocked;
	}

	public Date getLastLoginAt() {
		return this.lastLoginAt;
	}

	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastPasswordChangedAt() {
		return this.lastPasswordChangedAt;
	}

	public void setLastPasswordChangedAt(Timestamp lastPasswordChangedAt) {
		this.lastPasswordChangedAt = lastPasswordChangedAt;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public byte getStatususer() {
		return this.statususer;
	}

	public void setStatususer(byte statususer) {
		this.statususer = statususer;
	}

	public int getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<AccountForgotPassword> getAccountForgotPasswords() {
		return this.accountForgotPasswords;
	}

	public void setAccountForgotPasswords(List<AccountForgotPassword> accountForgotPasswords) {
		this.accountForgotPasswords = accountForgotPasswords;
	}

	public AccountForgotPassword addAccountForgotPassword(AccountForgotPassword accountForgotPassword) {
		getAccountForgotPasswords().add(accountForgotPassword);
		accountForgotPassword.setUser(this);

		return accountForgotPassword;
	}

	public AccountForgotPassword removeAccountForgotPassword(AccountForgotPassword accountForgotPassword) {
		getAccountForgotPasswords().remove(accountForgotPassword);
		accountForgotPassword.setUser(null);

		return accountForgotPassword;
	}

}