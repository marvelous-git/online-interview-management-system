package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CONVICTED")
public class ConvictedCases extends BackgroundChecks{
    @Column(name = "company")
    private String company;
}
