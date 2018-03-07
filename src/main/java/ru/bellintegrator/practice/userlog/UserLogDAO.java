package ru.bellintegrator.practice.userlog;

public interface UserLogDAO {

     void register(UserLog userLog);


    boolean login(String login, String password);
}
