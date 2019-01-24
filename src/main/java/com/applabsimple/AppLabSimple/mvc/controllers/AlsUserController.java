package com.applabsimple.AppLabSimple.mvc.controllers;

import com.applabsimple.AppLabSimple.entity.dto.AlsUser;
import com.applabsimple.AppLabSimple.entity.repository.AlsUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/index")
public class AlsUserController {
    private Logger logger = LoggerFactory.getLogger(AlsUserController.class);

    @Autowired
    private AlsUserRepository userRepository;

    @GetMapping
    public List<AlsUser> getAllUsers(){
        return (List<AlsUser>) userRepository.findAll();
    }

}
