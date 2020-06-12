package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "work_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "position")
    private String position;
    @Column(name = "company")
    private String company;
    @Column(name = "period_served")
    private String periodServed;

    @OneToMany(mappedBy = "workExperience", cascade = CascadeType.ALL)
    private List<Achievements> achievements;

    @OneToMany(mappedBy = "workExperience", cascade = CascadeType.ALL)
    private List<Reference> references;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;

}
