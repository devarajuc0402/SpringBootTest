package com.springboot.practice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.practice.entity.LoginEntity;

@Repository
public interface LoginRepository extends CrudRepository<LoginEntity, Long> {

	List<LoginEntity> findAll();

	Optional<LoginEntity> findByEmail(String userName);

}
