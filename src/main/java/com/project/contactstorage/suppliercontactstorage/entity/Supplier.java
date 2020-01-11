package com.project.contactstorage.suppliercontactstorage.entity;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name = "company_website")
    private String companyWebSite;


    @Column(name = "manager_name")
    private String managerName;


    @Column(name = "manager_email")
    private String managerEmail;


    @Column(name = "company_name")
    private String companyName;


    @Column(name = "product_name")
    private String productName;

    public Supplier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", companyWebSite='" + companyWebSite + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
