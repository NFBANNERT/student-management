package tn.esprit.studentmanagement.services;

import tn.esprit.studentmanagement.entities.Enrollment;

import java.util.List;
import java.util.Optional;

public interface IEnrollment {
    public List<Enrollment> getAllEnrollments();
    public Optional<Enrollment> getEnrollmentById(Long idEnrollment);
    public Enrollment saveEnrollment(Enrollment enrollment);
    public void deleteEnrollment(Long idEnrollment);

}
