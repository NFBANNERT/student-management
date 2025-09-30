package tn.esprit.studentmanagement.services;

import tn.esprit.studentmanagement.entities.Department;

import java.util.List;
import java.util.Optional;

public interface IDepartmentService {
    public List<Department> getAllDepartments();
    public Optional<Department> getDepartmentById(Long idDepartment);
    public Department saveDepartment(Department department);
    public void deleteDepartment(Long idDepartment);
}
