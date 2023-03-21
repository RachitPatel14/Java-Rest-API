package com.rachit.app.rest.RestAPI.Repo;

import com.rachit.app.rest.RestAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
