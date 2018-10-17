package com.cg.banking.beans;
public class UserTable {
	private String accountId;
	private String userId;
	private String loginPassword;
	private String secretQuestion;
	private String transactionPassword;
	private int lockStatus;
	public UserTable() {
		super();
	}
	public UserTable(String accountId, String userId, String loginPassword, String secretQuestion,
			String transactionPassword, int lockStatus) {
		super();
		this.accountId = accountId;
		this.userId = userId;
		this.loginPassword = loginPassword;
		this.secretQuestion = secretQuestion;
		this.transactionPassword = transactionPassword;
		this.lockStatus = lockStatus;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getSecretQuestion() {
		return secretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}
	public String getTransactionPassword() {
		return transactionPassword;
	}
	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
	public int getLockStatus() {
		return lockStatus;
	}
	public void setLockStatus(int lockStatus) {
		this.lockStatus = lockStatus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + lockStatus;
		result = prime * result + ((loginPassword == null) ? 0 : loginPassword.hashCode());
		result = prime * result + ((secretQuestion == null) ? 0 : secretQuestion.hashCode());
		result = prime * result + ((transactionPassword == null) ? 0 : transactionPassword.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTable other = (UserTable) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (lockStatus != other.lockStatus)
			return false;
		if (loginPassword == null) {
			if (other.loginPassword != null)
				return false;
		} else if (!loginPassword.equals(other.loginPassword))
			return false;
		if (secretQuestion == null) {
			if (other.secretQuestion != null)
				return false;
		} else if (!secretQuestion.equals(other.secretQuestion))
			return false;
		if (transactionPassword == null) {
			if (other.transactionPassword != null)
				return false;
		} else if (!transactionPassword.equals(other.transactionPassword))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserTable [accountId=" + accountId + ", userId=" + userId + ", loginPassword=" + loginPassword
				+ ", secretQuestion=" + secretQuestion + ", transactionPassword=" + transactionPassword
				+ ", lockStatus=" + lockStatus + "]";
	}
}
