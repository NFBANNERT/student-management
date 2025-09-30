package tn.esprit.studentmanagement.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.studentmanagement.repositories.EnrollmentRepository;
import tn.esprit.studentmanagement.entities.Enrollment;
import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService implements IEnrollment {
    private final EnrollmentRepository enrollmentRepository;
    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }
    @Override
    public List<Enrollment> getAllEnrollments() {

        return enrollmentRepository.findAll();
    }

    @Override
    public Optional<Enrollment> getEnrollmentById(Long idEnrollment) {

        return enrollmentRepository.findById(idEnrollment);
    }

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {

        return enrollmentRepository.save(enrollment);
    }

    @Override
    public void deleteEnrollment(Long idEnrollment) {

        enrollmentRepository.deleteById(idEnrollment);
    }
}
