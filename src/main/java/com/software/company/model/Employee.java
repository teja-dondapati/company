package com.software.company.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "employee_type", length = 1)
    private Character employeeType;

//    @Column(name = "team_id")
//    private Integer teamId;


    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    // Constructors, getters, setters, and other methods...

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Character getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Character employeeType) {
        this.employeeType = employeeType;
    }

    // Other methods, if needed...

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                ", employeeType=" + employeeType +
                '}';
    }
}
