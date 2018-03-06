package ru.bellintegrator.practice.organization;

import ru.bellintegrator.practice.person.Person;

import java.util.List;

public interface OrganizationDAO {

    List<Organization> all();


    Organization loadById(Long id);


    void update(Organization organization);


    void save(Organization organization);

}
