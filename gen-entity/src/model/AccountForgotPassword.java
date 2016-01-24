package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ACCOUNT_FORGOT_PASSWORD database table.
 * 
 */
@Entity
@Table(name="ACCOUNT_FORGOT_PASSWORD")
@NamedQuery(name="AccountForgotPassword.findAll", query="SELECT a FROM AccountForgotPassword a")
public class AccountForgotPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TOKEN")
	private String token;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON")
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXPIRE_ON")
	private Date expireOn;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID")
	private User user;

	public AccountForgotPassword() {
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getExpireOn() {
		return this.expireOn;
	}

	public void setExpireOn(Date expireOn) {
		this.expireOn = expireOn;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}