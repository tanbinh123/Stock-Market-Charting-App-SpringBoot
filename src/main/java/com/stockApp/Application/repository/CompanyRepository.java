package com.stockApp.Application.repository;

import com.stockApp.Application.dao.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
