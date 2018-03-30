package com.rainyalley.architecture.dao.entity;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

public class UserDo implements Serializable {

    private static final long serialVersionUID = 2894257361469960272L;

    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotBlank
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDo)) return false;

        UserDo userDo = (UserDo) o;

        if (getId() != null ? !getId().equals(userDo.getId()) : userDo.getId() != null) return false;
        if (getName() != null ? !getName().equals(userDo.getName()) : userDo.getName() != null) return false;
        return getPassword() != null ? getPassword().equals(userDo.getPassword()) : userDo.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
