package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "interview_name")
    private String name;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "department")
    private String department;

    @Column(name = "section")
    private String section;

    @Column(name = "panel")
    private String panel;

    @OneToMany(mappedBy = "interview", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Session> sessions;


}
