package com.example.sso.Entity;

import jakarta.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Table(name = "SSO_USER_TEST")
public class ssoUserEntity
{
    @Id
    @Column(name = "request_date")
    private Timestamp requestDate ;

    @Column(name = "ssotype")
    private String ssoType;

    @Column(name = "systemid")
    private String systemId;

    @Column(name = "systemname")
    private String  systemName;

    @Column(name = "systemtransactions")
    private String systemTransactions;

    @Column(name = "systemprivileges")
    private String systemPrivileges;

    @Column(name = "systemusergroup")
    private String systemUserGroup ;

    @Column(name = "systemlocationgroup")
    private String systemLocationGroup;

    @Column(name = "userid")
    private String  userId ;

    @Column(name = "userfullname")
    private String  userFullname ;

    @Column(name = "userrdofficecode")
    private String  userRdOfficeCode  ;

    @Column(name = "userofficecode")
    private String  userOfficeCode  ;

    @Column(name = "clientlocation")
    private String  clientLocation ;

    @Column(name = "locationmachinenumber")
    private String  locationMachineNumber  ;

    @Column(name = "tokenid")
    private String  tokenId  ;

    public Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsoType() {
        return ssoType;
    }

    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return systemTransactions;
    }

    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserRdOfficeCode() {
        return userRdOfficeCode;
    }

    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
