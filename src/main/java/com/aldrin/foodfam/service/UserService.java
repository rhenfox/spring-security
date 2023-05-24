package com.aldrin.foodfam.service;



import com.aldrin.foodfam.model.User;
import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
