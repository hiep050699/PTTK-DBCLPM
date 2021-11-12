package com.example.PTTKDBCLPM.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PTTKDBCLPM.model.ImportBill;
import com.example.PTTKDBCLPM.model.ImportBillDetail;

public interface ImportBillDetailRepo extends JpaRepository<ImportBillDetail, Long> {

//	 List<ImportBillDetail> findByImport_bill(ImportBill import_bill);
	 
}
