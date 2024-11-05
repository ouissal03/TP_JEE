/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkd;

/**
 *
 * @author 21263
 */
public class Employee {
    private Name name;
private Company company;
public Employee(Name name, Company company) {
setName(name);
setCompany(company);
}
public Name getName() { return (name); }
public void setName(Name name) { this.name = name; }
public Company getCompany() { return (company); }
public void setCompany(Company company) { this.company = company; }
}
