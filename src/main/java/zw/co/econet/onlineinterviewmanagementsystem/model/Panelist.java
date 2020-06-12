package zw.co.econet.onlineinterviewmanagementsystem.model;

import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.Gender;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "panelist")
public class Panelist extends Person{

    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
    @Column(name = "designation")
    private String designation;
    @Column(name = "department")
    private String department;
    @Column(name = "company")
    private String company;

    @ManyToMany(mappedBy = "panelists")
    private List<Session> sessions;

}
