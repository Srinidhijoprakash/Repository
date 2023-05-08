package com.PHONES_GARAGE.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PHONES_GARAGE.demo.model.PhonesModel;

public interface PhonesRepository extends JpaRepository<PhonesModel, Integer> {

}
