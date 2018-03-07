package ru.bellintegrator.practice.office;

import javax.persistence.*;


@Entity
@Table(name = "Office")
public class Office {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;


    @Version
    private Integer version;


    @Basic(optional = false)
    @Column(name = "org_id")
    private Long officeId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Basic(optional = false)
    @Column(name = "is_active")
    private Boolean IsActive;

    public Office(Long officeId, String name, String address, String phone, Boolean isActive) {
        this.officeId = officeId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        IsActive = isActive;
    }

    public Office() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId());
        builder.append("org_id:");
        builder.append(getOfficeId());
        builder.append(";name:");
        builder.append(getName());
        builder.append(";address:");
        builder.append(getAddress());
        builder.append(";phone:");
        builder.append(getPhone());
        builder.append(";is_active:");
        builder.append(getActive());
        builder.append("}");

        return builder.toString();
    }
}
