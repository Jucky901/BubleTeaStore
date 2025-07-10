package com.bubletea.store.service;
import com.bubletea.store.model.Bill;
import com.bubletea.store.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;
    public List<Bill> getAllBills(){
        return billRepository.findAll();
    }

    public void saveBill(Bill bill) {
        billRepository.save(bill);
    }
    
}
