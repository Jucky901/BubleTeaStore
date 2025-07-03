package com.bubletea.store.repository;
import com.bubletea.store.model.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetail, BillDetailId> {
}
