package com.neelav.springbootsecurityjpa;

import com.neelav.springbootsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public  interface UserRepository extends JpaRepository<User,Integer> {

    public Optional<User> findByUserName(String userName);
}
