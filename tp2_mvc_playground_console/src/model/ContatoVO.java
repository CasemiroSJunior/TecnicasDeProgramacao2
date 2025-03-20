package model;

import java.util.Objects;

public class ContatoVO {
    private Integer id;
    private String name;
    private String number;
    private String email;

    public ContatoVO(Integer id, String name, String number, String email) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContatoVO contatoVO = (ContatoVO) o;
        return Objects.equals(id, contatoVO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
