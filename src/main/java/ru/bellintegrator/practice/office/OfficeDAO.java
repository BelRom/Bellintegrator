package ru.bellintegrator.practice.office;

import ru.bellintegrator.practice.employee.Employee;
import ru.bellintegrator.practice.old.person.Person;

import java.util.List;

public interface OfficeDAO {

    List<Office> all();

    Office loadById(Long id);

    Office update(Office office);

    void save(Office office);

    void delete(Long id);
}
