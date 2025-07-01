package com.bubletea.store.repository;

import com.bubletea.store.model.Bill;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


@Repository
public interface BillRepository  extends JpaRepository<Bill, Integer>{
    List<Bill> findAll();
}
