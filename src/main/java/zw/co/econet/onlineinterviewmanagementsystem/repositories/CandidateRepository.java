package zw.co.econet.onlineinterviewmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.econet.onlineinterviewmanagementsystem.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
