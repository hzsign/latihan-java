package com.belajar.postes.services.Impl;

import com.belajar.postes.models.User;
import com.belajar.postes.repository.UserRepository;
import com.belajar.postes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
