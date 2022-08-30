package edu.udea.sistema_gestion_proyectos.model;

import org.springframework.lang.NonNull;
import java.util.*;

public class Empleado {
    private long id;
    private String name;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Empresa enterprise;
    private ArrayList<MovimientoDinero> transactions;
    private Date createdAt;
    private Date updatedAt;

    public Empleado(@NonNull long id,
                    String name,
                    String email,
                    Profile profile,
                    Enum_RoleName role,
                    Empresa enterprise,
                    ArrayList<MovimientoDinero> transactions,
                    Date createdAt,
                    Date updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
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

    public void setEmail(String email) { this.email = email; }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() { return role; }

    public void setRole(Enum_RoleName role) { this.role = role; }

    public Empresa getEnterprise() { return enterprise; }

    public void setEnterprise(Empresa enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<MovimientoDinero> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<MovimientoDinero> transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
