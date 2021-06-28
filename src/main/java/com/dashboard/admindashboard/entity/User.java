package com.dashboard.admindashboard.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User {

    @Id
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("username")
    private String userName;

    @NotNull
    @JsonProperty("fullName")
    private String fullName;

    @NotNull
    @JsonProperty("email")
    private String email;

    @NotNull
    @JsonProperty("password")
    private String password;

    @NotNull
    @JsonProperty("phoneNum")
    private String phoneNum;

    @NotNull
    @JsonProperty("address")
    private String address;

    @NotNull
    @JsonProperty("gender")
    private String gender;
}
