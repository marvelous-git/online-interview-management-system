package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "reference")
public class Reference extends Person {
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "position")
    private String position;

    @ManyToOne
    @JoinColumn(name = "work_experience_id", referencedColumnName = "id")
    private WorkExperience workExperience;

}
