package org.acme.insurance.policyquote;

import java.io.Serializable;

public class Driver implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String driverName;
    private Integer age;
    private String ssn;
    private String dlNumber;
    private Integer numberOfAccidents;
    private Integer numberOfTickets;
    private Integer creditScore;
    
    public Driver() {};
    
    public Driver(String id) {
        this.id = id;
    }

    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("\nDriver \n\tid = ");
        sBuilder.append(getId());
        sBuilder.append("\n\tdriverName = ");
        sBuilder.append(getDriverName());
        sBuilder.append("\n\tage = ");
        sBuilder.append(getAge());
        sBuilder.append("\n\tssn = ");
        sBuilder.append(getSsn());
        sBuilder.append("\n\tdlNumber = ");
        sBuilder.append(getDlNumber());
        sBuilder.append("\n\tnumberOfAccidents = ");
        sBuilder.append(getNumberOfAccidents());
        sBuilder.append("\n\tnumberOfTickets = ");
        sBuilder.append(getNumberOfTickets());
        sBuilder.append("\n\tcreditScore = ");
        sBuilder.append(getCreditScore());
        return sBuilder.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDlNumber() {
        return this.dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public Integer getNumberOfAccidents() {
        return this.numberOfAccidents;
    }

    public void setNumberOfAccidents(Integer numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    public Integer getNumberOfTickets() {
        return this.numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Integer getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (age == null ? 0 : age.hashCode());
        result = 31*result + (creditScore == null ? 0 : creditScore.hashCode());
        result = 31*result + (dlNumber == null ? 0 : dlNumber.hashCode());
        result = 31*result + (driverName == null ? 0 : driverName.hashCode());
        result = 31*result + (numberOfAccidents == null ? 0 : numberOfAccidents.hashCode());
        result = 31*result + (numberOfTickets == null ? 0 : numberOfTickets.hashCode());
        result = 31*result + (ssn == null ? 0 : ssn.hashCode());
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Driver)) {
            return false;
        }
        Driver d = (Driver) obj;
        return (age == null ? d.age == null : age.equals(d.age))
            && (driverName == null ? d.driverName == null : driverName.equals(d.driverName))
            && (dlNumber == null ? d.dlNumber == null : dlNumber.equals(d.dlNumber))
            && (creditScore == null ? d.creditScore == null : creditScore.equals(d.creditScore))
            && (numberOfAccidents == null ? d.numberOfAccidents == null : numberOfAccidents.equals(d.numberOfAccidents))
            && (numberOfTickets == null ? d.numberOfTickets == null : numberOfTickets.equals(d.numberOfTickets))
            && (ssn == null ? d.ssn == null : ssn.equals(d.ssn));
    }
    
    
}
