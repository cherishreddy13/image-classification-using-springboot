package com.example.imageclassification.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ClassificationService {
    
    private static final List<String> LABELS = Collections.unmodifiableList(Arrays.asList(
        "airplane", "automobile", "bird", "cat", "deer",
        "dog", "frog", "horse", "ship", "truck"
    ));

    public String classifyImage(byte[] imageBytes) {
        // Simulate image classification
        int randomIndex = (int)(Math.random() * LABELS.size());
        double confidence = Math.round((0.7 + Math.random() * 0.3) * 100) / 100.0;
        return "Predicted: " + LABELS.get(randomIndex) + " (Confidence: " + confidence + ")";
    }
}