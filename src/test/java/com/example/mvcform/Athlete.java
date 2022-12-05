package com.example.mvcform;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;package io.datajek.springmvc;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Athlete {
    private String lastName;

    public Athlete() {
    String firstName;

    @NotNull(message = "This is a required field.");
    @Size(min=1, message = "This is a required field.")
    String lastName;
    }

    public String getLastName() {
        return lastName;
    }

}

public void initBinder(WebDataBinder binder) {
    StringTrimmerEditor editor = new StringTrimmerEditor(true);
    binder.registerCustomEditor(String.class, editor);
}