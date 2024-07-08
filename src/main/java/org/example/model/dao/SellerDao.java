package org.example.model.dao;
import org.example.model.entitites.Department;
import org.example.model.entitites.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller seller);
    void update(Seller seller);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
