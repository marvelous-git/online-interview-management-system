package zw.co.econet.onlineinterviewmanagementsystem.model;

import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.Gender;
import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.HighestQualification;
import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.InterviewStatus;
import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.MaritalStatus;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidate")
public class Candidate extends Person {

    @Column(name = "interview_status")
    private InterviewStatus interviewStatus;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    private MaritalStatus maritalStatus;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "religion")
    private String religion;

    @Column(name = "id_number")
    private String IdNumber;

    @Column(name = "date_Of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "highest_qualification")
    private HighestQualification highestQualification;

    @Column(name = "years_of_experience")
    private int yearsOfExperience;

    @Column(name = "has_valid_drivers_license")
    private Boolean hasValidDriversLicense;

    @Column(name = "has_valid_passport")
    private Boolean hasValidPassport;

    @Column(name = "has_been_disciplined")
    private Boolean hasBeenDisciplined;

    @Column(name = "has_been_convicted")
    private Boolean hasBeenConvicted;

    @Column(name = "has_relatives")
    private Boolean hasRelatives;

    @Column(name = "relative")
    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Relative> relatives;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @Column(name="number_of_Children")
    private int numberOfChildren;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Child> children;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_id", referencedColumnName = "id")
    private Application application;

    @OneToOne(mappedBy = "candidate", fetch = FetchType.LAZY)
    private Session session;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "current_employemt_id", referencedColumnName = "id")
    private CurrentEmploymentDetails currentEmploymentDetails;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<Qualification> qualifications;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<BackgroundChecks> backgroundChecks;
}
