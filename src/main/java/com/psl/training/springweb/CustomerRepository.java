package com.psl.training.springweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository {


    @Query(value = "select count(*) from customers_tbl")
    public int getTotalCustomer();
}
