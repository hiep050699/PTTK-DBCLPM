package com.example.PTTKDBCLPM.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PTTKDBCLPM.model.ImportBill;
import com.example.PTTKDBCLPM.model.Supplier;

public interface ImportBillRepo extends JpaRepository<ImportBill, Long> {
	
	// List<ImportBill> findBySupplier(Supplier supplier);
	
	
	// List<ImportBill> findByDate_created(Date date_created);

}
