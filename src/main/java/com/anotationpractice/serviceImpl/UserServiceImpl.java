package com.anotationpractice.serviceImpl;

import com.anotationpractice.dto.UserCreateRequest;
import com.anotationpractice.dto.UserCreateResponse;
import com.anotationpractice.entity.Profile;
import com.anotationpractice.entity.User;
import com.anotationpractice.repository.ProfileRepository;
import com.anotationpractice.repository.UserRepository;
import com.anotationpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public UserCreateResponse save(UserCreateRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());

        Profile profile = new Profile();
        profile.setAddress(request.getAddress());
        profile.setCity(request.getCity());

        profileRepository.save(profile);

        user.setProfile(profile);

        userRepository.save(user);

        UserCreateResponse response = new UserCreateResponse();
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setAddress(profile.getAddress());
        response.setCity(profile.getCity());

        return response;
    }

    @Override
    public User getUser(Long id) {
         Optional<User> user = userRepository.findById(id);
         return user.get();
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
