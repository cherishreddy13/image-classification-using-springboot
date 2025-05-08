package com.example.imageclassification.controller;

import com.example.imageclassification.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")  // Added base path
public class ClassificationController {
    
    @Autowired
    private ClassificationService classificationService;
    
    @PostMapping("/classify")
    public String classifyImage(@RequestParam("file") MultipartFile file) {
        try {
            return classificationService.classifyImage(file.getBytes());
        } catch (Exception e) {
            return "Error processing image: " + e.getMessage();
        }
    }
}