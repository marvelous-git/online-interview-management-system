package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "relative")
public class Relative extends Person {

    @Column(name = "relationship")
    private String relationship;
    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
}
