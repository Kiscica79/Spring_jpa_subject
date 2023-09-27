package hu.progmatic.spring_jpa_subject.controller;


import hu.progmatic.spring_jpa_subject.model.Subject;
import hu.progmatic.spring_jpa_subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping // localhost:8080/subjects
    public List<Subject> showAllProducts() {
        return subjectService.getAllProducts();
    }

    // ID szerint megjeleníteni egy entitást
    @GetMapping("/{id}")
    public Subject showProductById(@PathVariable Long id) {
        return subjectService.getProductById(id);
    }

    @PostMapping
    public Subject addNewProducts(@RequestBody Subject product) {
        return subjectService.addProduct(product);
    }


}
