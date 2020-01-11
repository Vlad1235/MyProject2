package com.project.contactstorage.suppliercontactstorage.dao;

import com.project.contactstorage.suppliercontactstorage.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
