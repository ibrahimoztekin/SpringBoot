package com.works.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.mvc.entities.login;

public interface LoginRepository extends JpaRepository<login, Long> {


}