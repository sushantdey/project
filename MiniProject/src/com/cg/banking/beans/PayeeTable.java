package com.cg.banking.beans;
public class PayeeTable {
	private String accountId;
	private String payeeAccountId;
	private String nickname;
	public PayeeTable() {
		super();
	}
	public PayeeTable(String accountId, String payeeAccountId, String nickname) {
		super();
		this.accountId = accountId;
		this.payeeAccountId = payeeAccountId;
		this.nickname = nickname;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPayeeAccountId() {
		return payeeAccountId;
	}
	public void setPayeeAccountId(String payeeAccountId) {
		this.payeeAccountId = payeeAccountId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((payeeAccountId == null) ? 0 : payeeAccountId.hashCode());
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
		PayeeTable other = (PayeeTable) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (payeeAccountId == null) {
			if (other.payeeAccountId != null)
				return false;
		} else if (!payeeAccountId.equals(other.payeeAccountId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PayeeTable [accountId=" + accountId + ", payeeAccountId=" + payeeAccountId + ", nickname=" + nickname
				+ "]";
	}
}
