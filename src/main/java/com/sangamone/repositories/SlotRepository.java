package com.sangamone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.entities.CreateSlot;

public interface SlotRepository extends JpaRepository<CreateSlot, Long> {

}
