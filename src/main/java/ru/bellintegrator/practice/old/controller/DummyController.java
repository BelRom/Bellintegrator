package ru.bellintegrator.practice.old.controller;

import org.springframework.web.bind.annotation.RequestBody;
import ru.bellintegrator.practice.old.view.PersonView;

import java.util.List;

public interface DummyController {
    /**
     * Dummy controller
     * Just for testing
     */
    String ping();

    /**
     * Add person
     * @param person
     */
    void person(@RequestBody PersonView person);

    /**
     * Get all persons
     * @return JSON persons value
     */
    List<PersonView> persons();
}
