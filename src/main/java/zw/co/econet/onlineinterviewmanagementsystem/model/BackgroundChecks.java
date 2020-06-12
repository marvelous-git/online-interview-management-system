package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "case_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "background_checks")
public class BackgroundChecks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nature")
    private String nature;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
}
