
package model;

import java.math.BigDecimal;
import java.util.Date;


public class Coupon {
	
	private String couponCode;
	private String couponName;
	private Date numberOfDaysIsValid;
	private BigDecimal percentageReduction;

	public Coupon() {
	}

	public Coupon(String code, String name, Date numberOfDaysIsValid, BigDecimal percentageReduction) {
		this.couponCode = code;
		this.couponName = name;
		this.numberOfDaysIsValid = numberOfDaysIsValid;
		this.percentageReduction = percentageReduction;
	}

	public String getCode() {
		return couponCode;
	}

	public void setCode(String code) {
		this.couponCode = code;
	}
	
	public String getName() {
		return couponName;
	}

	public void setName(String name) {
		this.couponName = name;
	}

	public Date getNumberOfDaysIsValid() {
		return numberOfDaysIsValid;
	}

	public void setNumberOfDaysIsValid(Date numberOfDaysIsValid) {
		this.numberOfDaysIsValid = numberOfDaysIsValid;
	}

	public BigDecimal getPercentageReduction() {
		return percentageReduction;
	}

	public void setPercentageReduction(BigDecimal percentageReduction) {
		this.percentageReduction = percentageReduction;
	}
	
	
	
	
	
}
