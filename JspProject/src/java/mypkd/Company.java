/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkd;

/**
 *
 * @author 21263
 */
public class Company {
private String companyName;
private String business;
public Company() {}
public Company(String companyName, String business) {
setCompanyName(companyName);
setBusiness(business);
}
public String getCompanyName() { return (companyName); }
public void setCompanyName(String companyName) { this.companyName = companyName; }
public String getBusiness() { return (business); }
public void setBusiness(String business) { this.business = business; }
    
}
