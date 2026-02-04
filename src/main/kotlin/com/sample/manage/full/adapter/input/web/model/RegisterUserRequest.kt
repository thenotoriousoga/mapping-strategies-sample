package com.sample.manage.full.adapter.input.web.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull

data class RegisterUserRequest(
    @get:NotNull
    @JsonProperty("user_name")
    val name: String?,
    @get:NotNull
    @JsonProperty("email")
    val email: String?,
    @get:NotNull
    @JsonProperty("password")
    val password: String?,
)
