package com.yoda.insurance.controller;

import com.yoda.insurance.model.Insurance;
import com.yoda.insurance.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceRepository repository;

    @GetMapping
    public List<Insurance> getAllInsurance() {
        return repository.findAll();
    }

    @PostMapping
    public Insurance createInsurance(@RequestBody Insurance insurance) {
        return repository.save(insurance);
    }
}
