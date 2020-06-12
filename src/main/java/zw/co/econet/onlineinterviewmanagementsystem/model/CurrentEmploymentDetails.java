package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "current_employment_details")
public class CurrentEmploymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "current_position")
    private String currentPosition;

    @Column(name = "employer")
    private String employer;

    @Column(name = "current_benefits")
    private Double currentBenefits;

    @Column(name = "reasons_for_leaving")
    private String reasonsForLeaving;

    @Column(name = "notice_period_in_days")
    private int noticePeriodInDays;

    @Column(name = "expected_salary")
    private Double expectedSalary;

    @Column(name = "expected_benefits")
    private String expectedBenefits;

}
