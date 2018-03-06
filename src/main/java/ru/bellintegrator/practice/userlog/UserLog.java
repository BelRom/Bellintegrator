package ru.bellintegrator.practice.userlog;


import javax.persistence.*;


@Entity
@Table(name = "UserLog")
public class UserLog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic(optional = false)
    @Column(name = "login", unique = true)
    private String login;

    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public UserLog() {
    }

    public UserLog(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id:");
        builder.append(getId().toString());
        builder.append(";name:");
        builder.append(getName());
        builder.append(";login:");
        builder.append(getLogin());
        builder.append(";password:");
        builder.append(getPassword());
        builder.append("}");
        return builder.toString();
    }
}
