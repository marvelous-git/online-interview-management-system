package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "achievements")
public class Achievements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "achievement")
    private String achievement;
    @ManyToOne
    @JoinColumn(name = "work_experience_id", referencedColumnName = "id")
    private WorkExperience workExperience;
}
