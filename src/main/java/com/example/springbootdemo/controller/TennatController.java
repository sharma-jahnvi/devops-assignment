package com.example.springbootdemo.controller;

import com.example.springbootdemo.Service.TenantService;
import com.example.springbootdemo.model.Tenant;
import com.example.springbootdemo.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tenants")
public class TennatController {

    @Autowired
    private TenantService tenantService;

    @PostMapping()
    public ResponseEntity<Tenant> savetenant( @RequestBody Tenant tenant) {
        return new ResponseEntity<Tenant>(tenantService.saveTenant(tenant), HttpStatus.CREATED);
    }

//    @PostMapping()
//    public ResponseEntity<Tenant> savetenantArray( @RequestBody Tenant tenant) {
//        return new ResponseEntity<Tenant>(tenantService.saveTenant(tenant), HttpStatus.CREATED);
//    }


    //get all tenants
    @GetMapping("/getTenants")
    public List<Tenant> getAllTenants(){
        return tenantService.getAllTenants();

    }

    //by id
    @GetMapping("{id}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable long id){
        return new ResponseEntity<Tenant>(tenantService.getTenantById(id),HttpStatus.FOUND);
    }


}
