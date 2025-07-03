package com.bubletea.store.repository;

import com.bubletea.store.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {
}