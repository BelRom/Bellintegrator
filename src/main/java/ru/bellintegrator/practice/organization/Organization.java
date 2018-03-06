package ru.bellintegrator.practice.organization;


import javax.persistence.*;

@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic(optional = false)
    @Column(name = "organization_id")
    private Integer organizationId;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "inn")
    private String inn;

    @Column(name = "kpp")
    private String kpp;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Basic(optional = false)
    @Column(name = "is_active")
    private Boolean isActive;



    public Organization() {
    }

    public Organization(Integer organizationId, String name, String fullName, String inn, String kpp, String address, String phone, Boolean isActive) {
        this.organizationId = organizationId;
        this.name = name;
        this.fullName = fullName;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
        this.phone = phone;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId().toString());
        builder.append(";organization_id:");
        builder.append(getOrganizationId().toString());
        builder.append(";name:");
        builder.append(getName());
        builder.append(";full_name:");
        builder.append(getfullName());
        builder.append(";inn:");
        builder.append(getInn());
        builder.append(";kpp:");
        builder.append(getKpp());
        builder.append(";address:");
        builder.append(getAddress());
        builder.append(";phone:");
        builder.append(getPhone());
        builder.append(";is_active:");
        builder.append(getIsActive());
        builder.append("}");
        return builder.toString();
    }
}
