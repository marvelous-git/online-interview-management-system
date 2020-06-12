package zw.co.econet.onlineinterviewmanagementsystem.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CRIMINAL")
public class CriminalCases extends BackgroundChecks {
    private Boolean isPending;
    private String country;
}
