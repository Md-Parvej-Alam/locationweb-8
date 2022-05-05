package com.location.ropsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entity.Rocations;

public interface RocationRepository extends JpaRepository<Rocations, Long> {

}
