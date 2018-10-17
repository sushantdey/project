package com.cg.banking.beans;
import java.util.Date;
public class FundTransfer {
	private String fundTransferId;
	private String accountId;
	private String payeeAccountId;
	private Date dateOfTransfer;
	private double transferAmount;
	public FundTransfer() {
		super();
	}
	public FundTransfer(String fundTransferId, String accountId, String payeeAccountId, Date dateOfTransfer,
			double transferAmount) {
		super();
		this.fundTransferId = fundTransferId;
		this.accountId = accountId;
		this.payeeAccountId = payeeAccountId;
		this.dateOfTransfer = dateOfTransfer;
		this.transferAmount = transferAmount;
	}
	public String getFundTransferId() {
		return fundTransferId;
	}
	public void setFundTransferId(String fundTransferId) {
		this.fundTransferId = fundTransferId;
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
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}
	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((dateOfTransfer == null) ? 0 : dateOfTransfer.hashCode());
		result = prime * result + ((fundTransferId == null) ? 0 : fundTransferId.hashCode());
		result = prime * result + ((payeeAccountId == null) ? 0 : payeeAccountId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(transferAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FundTransfer other = (FundTransfer) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (dateOfTransfer == null) {
			if (other.dateOfTransfer != null)
				return false;
		} else if (!dateOfTransfer.equals(other.dateOfTransfer))
			return false;
		if (fundTransferId == null) {
			if (other.fundTransferId != null)
				return false;
		} else if (!fundTransferId.equals(other.fundTransferId))
			return false;
		if (payeeAccountId == null) {
			if (other.payeeAccountId != null)
				return false;
		} else if (!payeeAccountId.equals(other.payeeAccountId))
			return false;
		if (Double.doubleToLongBits(transferAmount) != Double.doubleToLongBits(other.transferAmount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FundTransfer [fundTransferId=" + fundTransferId + ", accountId=" + accountId + ", payeeAccountId="
				+ payeeAccountId + ", dateOfTransfer=" + dateOfTransfer + ", transferAmount=" + transferAmount + "]";
	}
}
