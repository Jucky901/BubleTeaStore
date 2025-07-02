package com.bubletea.store.service;
import com.bubletea.store.model.*;
import com.bubletea.store.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillDetailService {
    @Autowired
    private BillDetailRepository billDetailRepository;

    public List<BillDetail> getAllBillDetails()
    {
        return billDetailRepository.findAll();
    }
}
