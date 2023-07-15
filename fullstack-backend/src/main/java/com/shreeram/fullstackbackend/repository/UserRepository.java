package com.shreeram.fullstackbackend.repository;

import com.shreeram.fullstackbackend.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{

}
