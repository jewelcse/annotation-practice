package com.anotationpractice.service;

import com.anotationpractice.dto.UserCreateRequest;
import com.anotationpractice.dto.UserCreateResponse;
import com.anotationpractice.entity.Profile;
import com.anotationpractice.entity.User;
import com.anotationpractice.repository.ProfileRepository;
import com.anotationpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public User createUser(User user) {

        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public UserCreateResponse createUser(UserCreateRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        Profile profile = new Profile();
        profile.setAddress(request.getAddress());
        profile.setCity(request.getCity());

        user.setProfile(profile);

        profileRepository.save(profile);
        userRepository.save(user);

        return new UserCreateResponse(user.getName(), user.getEmail(), profile.getAddress(), profile.getCity());
    }
}
