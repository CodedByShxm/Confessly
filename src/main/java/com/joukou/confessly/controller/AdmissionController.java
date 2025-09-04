package com.joukou.confessly.controller;

import com.joukou.confessly.model.Admission;
import com.joukou.confessly.service.AdmissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admissions")
public class AdmissionController {

    private final AdmissionService service;

    public AdmissionController(AdmissionService service) {
        this.service = service;
    }

    @PostMapping
    public Admission createAdmission(@RequestBody Admission admission) {
        return service.saveAdmission(admission);
    }

    @GetMapping
    public List<Admission> getAdmissions() {
        return service.getAllAdmissions();
    }
}
