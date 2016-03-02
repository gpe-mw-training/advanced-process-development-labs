package org.acme.insurance.policyquote;

import java.io.Serializable;
import java.util.Date;

public class Policy implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Date requestDate;
    private String policyType;
    private Integer vehicleYear;
    private Integer price;
    private Integer priceDiscount;
    private String driver;

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("\nPolicy \n\tpolicyType = ");
        sBuilder.append(this.policyType);
        sBuilder.append("\n\tvehicleYear = ");
        sBuilder.append(this.vehicleYear);
        sBuilder.append("\n\tprice = ");
        sBuilder.append(this.price);
        sBuilder.append("\n\tpriceDiscount = ");
        sBuilder.append(this.priceDiscount);
        sBuilder.append("\n\tDriver = ");
        sBuilder.append(this.driver);
        return sBuilder.toString();
    }
    
    public Date getRequestDate() {
        return this.requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getPolicyType() {
        return this.policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Integer getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(Integer vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPriceDiscount() {
        return this.priceDiscount;
    }

    public void setPriceDiscount(Integer discount) {
        this.priceDiscount = discount;
    }

    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (requestDate == null ? 0 : requestDate.hashCode());
        result = 31*result + (policyType == null ? 0 : policyType.hashCode());
        result = 31*result + (vehicleYear == null ? 0 : vehicleYear.hashCode());
        result = 31*result + (price == null ? 0 : price.hashCode());
        result = 31*result + (priceDiscount == null ? 0 : priceDiscount.hashCode());
        result = 31*result + (driver == null ? 0 : driver.hashCode());
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Policy)) {
            return false;
        }
        Policy d = (Policy) obj;
        return (requestDate == null ? d.requestDate == null : requestDate.equals(d.requestDate)
            && (policyType == null ? d.policyType == null : policyType.equals(d.policyType))
            && (vehicleYear == null ? d.vehicleYear == null : vehicleYear.equals(d.vehicleYear))
            && (price == null ? d.price == null : price.equals(d.price))
            && (priceDiscount == null ? d.priceDiscount == null : priceDiscount.equals(d.priceDiscount))
            && (driver == null ? d.driver == null : driver.equals(d.driver)));
    }

}
