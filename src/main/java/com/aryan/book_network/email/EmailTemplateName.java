package com.aryan.book_network.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activation account");
    private final String name;
    EmailTemplateName(String name){
        this.name = name;
    }

}
