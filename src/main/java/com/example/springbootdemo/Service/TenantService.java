package com.example.springbootdemo.Service;

import com.example.springbootdemo.model.Tenant;

import java.util.List;

public interface TenantService {

    Tenant saveTenant(Tenant tenant);
    List<Tenant> getAllTenants();
    Tenant getTenantById(long id);
}
