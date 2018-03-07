package ru.bellintegrator.practice.employee;

import ru.bellintegrator.practice.old.person.Person;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> all();

    Employee loadById(Long id);

    Employee update(Employee employee);

    void save(Employee employee);

    void delete(Long id);
}
