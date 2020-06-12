package zw.co.econet.onlineinterviewmanagementsystem.model;

import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.QualificationStatus;
import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.QualificationType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "qualifications")
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "qualification_type")
    private QualificationType qualificationType;

    @Column(name = "qualification_name")
    private String qualificationName;

    @Column(name = "institution_name")
    private String institutionName;

    @Column(name = "country")
    private String country;

    @Column(name = "qualification_status")
    private QualificationStatus qualificationStatus;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
}
