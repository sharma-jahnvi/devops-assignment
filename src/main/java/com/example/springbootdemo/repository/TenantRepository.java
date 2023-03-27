package com.example.springbootdemo.repository;
import com.example.springbootdemo.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long>{

}

