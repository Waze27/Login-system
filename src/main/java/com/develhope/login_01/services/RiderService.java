package com.develhope.login_01.services;

import com.develhope.login_01.entities.User;
import com.develhope.login_01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RiderService {

    @Autowired
    private UserRepository userRepository;

    public User pickRider(){
        if(userRepository.pickRider().isPresent()){
            return userRepository.pickRider().get();
        }else{
            return userRepository.findAll(PageRequest.of(0,1)).toList().get(0);
        }
    }
}
