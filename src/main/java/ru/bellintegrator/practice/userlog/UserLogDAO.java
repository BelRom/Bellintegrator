package ru.bellintegrator.practice.userlog;

import ru.bellintegrator.practice.house.House;

public interface UserLogDAO {

     void register(UserLog userLog);


    boolean login(String login, String password);
}
