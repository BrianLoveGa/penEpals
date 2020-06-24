package com.brianLovelessCode.demoPals.repositories;

import com.brianLovelessCode.demoPals.models.Pals;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PalsRepository extends JpaRepository<Pals, Long> {

}
