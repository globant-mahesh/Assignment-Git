package com.corejava.assignments.spring.sampleapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * You can use @Autowired annotation on setter methods to get rid of the <property> element in XML configuration file.
 * When Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the
 * method.
 * <p>
 * 3 Types of autowiring
 * <p>
 * 1. Property based
 * 2. Setter based
 * 3. Constructor based
 */
@Component
public class TextEditorAnnotationAutowiring {

    //    @Autowired
    private SpellCheckerAnnotationAutowiring spellChecker;

    public SpellCheckerAnnotationAutowiring getSpellChecker() {
        return spellChecker;
    }

//    @Autowired
//    public TextEditorAnnotationAutowiring(SpellCheckerAnnotationAutowiring spellChecker){
//        System.out.println("Inside TextEditor constructor." );
//        this.spellChecker = spellChecker;
//    }

    @Autowired
    public void setSpellChecker(SpellCheckerAnnotationAutowiring spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
