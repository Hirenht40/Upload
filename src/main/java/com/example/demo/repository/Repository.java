package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Datamodel;

public interface Repository extends JpaRepository< Datamodel, Long> {

}
