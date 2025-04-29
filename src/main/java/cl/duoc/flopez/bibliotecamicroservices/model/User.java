package cl.duoc.flopez.bibliotecamicroservices.model;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate altaDate;

    public User(Long id, String name, String email, LocalDate altaDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.altaDate = altaDate;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getAltaDate() {
        return altaDate;
    }
    public void setAltaDate(LocalDate altaDate) {
        this.altaDate = altaDate;
    }
}



