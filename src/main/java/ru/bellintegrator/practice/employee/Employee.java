package ru.bellintegrator.practice.employee;


import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic(optional = false)
    @Column(name = "office_id")
    private Long officeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "position")
    private String position;

    @Column(name = "phone")
    private String phone;

    @Column(name = "doc_name")
    private String docName;

    @Column(name = "doc_number")
    private String docNumber;

    @Column(name = "doc_date")
    private String docDate;

    @Column(name = "citizenship_name")
    private String citizenshipName;

    @Basic(optional = false)
    @Column(name = "citizenship_code")
    private Integer citizenshipCode;

    @Basic(optional = false)
    @Column(name = "is_identified")
    private Boolean isIdentified;



    public Employee() {
    }

    public Employee(Long officeId, String firstName, String secondName, String middleName, String position, String phone, String docName, String docNumber, String docDate, String citizenshipName, Integer citizenshipCode, Boolean isIdentified) {
        this.officeId = officeId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.phone = phone;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docDate = docDate;
        this.citizenshipName = citizenshipName;
        this.citizenshipCode = citizenshipCode;
        this.isIdentified = isIdentified;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getCitizenshipName() {
        return citizenshipName;
    }

    public void setCitizenshipName(String citizenshipName) {
        this.citizenshipName = citizenshipName;
    }

    public Integer getCitizenshipCode() {
        return citizenshipCode;
    }

    public void setCitizenshipCode(Integer citizenshipCode) {
        this.citizenshipCode = citizenshipCode;
    }

    public Boolean getIsIdentified() {
        return isIdentified;
    }

    public void setIsIdentified(Boolean isIdentified) {
        this.isIdentified = isIdentified;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId().toString());
        builder.append(";office_id:");
        builder.append(getOfficeId());
        builder.append(";first_name:");
        builder.append(getFirstName());
        builder.append(";second_name:");
        builder.append(getSecondName());
        builder.append(";middle_name:");
        builder.append(getMiddleName());
        builder.append(";position:");
        builder.append(getPosition());
        builder.append(";phone:");
        builder.append(getPhone());
        builder.append(";doc_name:");
        builder.append(getDocName());
        builder.append(";doc_number:");
        builder.append(getDocNumber());
        builder.append(";doc_date:");
        builder.append(getDocDate());
        builder.append(";citizenship_name:");
        builder.append(getCitizenshipName());
        builder.append(";citizenship_code:");
        builder.append(getCitizenshipCode().toString());
        builder.append(";is_identified:");
        builder.append(getIsIdentified());
        builder.append("}");
        return builder.toString();
    }
}
