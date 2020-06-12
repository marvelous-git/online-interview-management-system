package zw.co.econet.onlineinterviewmanagementsystem.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import zw.co.econet.onlineinterviewmanagementsystem.utils.enums.ApplicationStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "application_status")
    private ApplicationStatus applicationStatus;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "company")
    private String company;

    @CreationTimestamp
    @Column(name = "date_created")
    private Date dateCreated;

    @UpdateTimestamp
    @Column(name = "date_last_modified")
    private Date dateLastModified;

    @OneToOne(mappedBy = "application")
    private Candidate candidate;

}
