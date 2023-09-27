package hu.progmatic.spring_jpa_subject.repo;


import hu.progmatic.spring_jpa_subject.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
