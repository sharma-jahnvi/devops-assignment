package com.example.springbootdemo.Service;


import com.example.springbootdemo.exception.ResourceNotFoundException;
import com.example.springbootdemo.model.Tenant;
import com.example.springbootdemo.repository.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantServiceImpl implements TenantService{


    private TenantRepository tenantRepository;

    //constructor based injection //other way is setter based injection
    public TenantServiceImpl(TenantRepository tenantRepository){
        super();
        this.tenantRepository=tenantRepository;

    }

    @Override
    public Tenant saveTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public List<Tenant> getAllTenants(){
        return tenantRepository.findAll();
    }

    @Override
    public Tenant getTenantById(long id) {
        Optional<Tenant> tenant=tenantRepository.findById(id);

        if(tenant.isPresent())
        {
            return tenant.get();
        }else
            throw new ResourceNotFoundException("Tenant with id : %l not present" +id);

    }


}
