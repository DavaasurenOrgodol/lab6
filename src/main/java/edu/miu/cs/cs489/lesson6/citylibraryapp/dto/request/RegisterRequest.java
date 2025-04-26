package edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request;

import edu.miu.cs.cs489.lesson6.citylibraryapp.user.Role;

public record RegisterRequest(
                String firstName,
                String lastName,
                String username,
                String password,
                Role role) {

}
