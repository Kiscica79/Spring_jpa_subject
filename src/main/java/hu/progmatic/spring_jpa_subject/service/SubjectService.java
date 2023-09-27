package hu.progmatic.spring_jpa_subject.service;


import hu.progmatic.spring_jpa_subject.model.Subject;
import hu.progmatic.spring_jpa_subject.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAllProducts() {
        return subjectRepository.findAll();
    }

    public Subject getProductById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    public Subject addProduct(Subject subject) {
        return subjectRepository.save(subject);
    }
}
