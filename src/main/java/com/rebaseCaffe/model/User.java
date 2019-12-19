package com.rebaseCaffe.model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    private final UUID sessionId;
    private final String name;
    private final String password;
    private final boolean admin;


}
