package com.sangamone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sangamone.entities.BookSlot;

public interface BookedSlotRepo extends CrudRepository<BookSlot, Long> {

}
