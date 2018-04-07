package com.corejava.assignments.spring.sampleapplication;

import org.springframework.stereotype.Component;

@Component
public class SpellCheckerAnnotationAutowiring {
    public SpellCheckerAnnotationAutowiring() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
}
