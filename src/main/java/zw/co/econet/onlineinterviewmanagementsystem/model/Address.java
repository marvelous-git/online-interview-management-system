package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;
    @Column(name = "address", length = 150)
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "provide")
    private String Province;
    @Column(name = "country")
    private String country;
    @ManyToOne
    @JoinColumn(name = "candidate_id", referencedColumnName = "id")
    private Candidate candidate;
}
