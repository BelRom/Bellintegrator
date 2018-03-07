package ru.bellintegrator.practice.old.house;

import java.util.List;

/**
 * DAO для работы с House
 */
public interface HouseDAO {
    /**
     * Получить все объекты House
     *
     * @return
     */
    List<House> all();

    /**
     * Получить House по идентификатору
     *
     * @param id
     * @return
     */
    House loadById(Long id);

    /**
     * Сохранить House
     *
     * @param house
     */
    void save(House house);
}
