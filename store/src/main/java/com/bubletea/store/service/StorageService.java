package com.bubletea.store.service;
import com.bubletea.store.model.Storage;
import com.bubletea.store.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public List<Storage> getAllStorages() {
        return storageRepository.findAll();
    }
}
