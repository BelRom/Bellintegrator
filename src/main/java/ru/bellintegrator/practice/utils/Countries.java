package ru.bellintegrator.practice.utils;


import javax.persistence.*;

@Entity
@Table(name = "Countries")
public class Countries {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;

    public Countries() {
    }

    public Countries(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId().toString());
        builder.append(";name:");
        builder.append(getName());
        builder.append(";code:");
        builder.append(getCode().toString());
        builder.append("}");
        return builder.toString();
    }
}
