package com.sample.manage.full.adapter.input.web.model

import com.fasterxml.jackson.annotation.JsonProperty

data class RegisterUserResponse(
    @JsonProperty("user_id")
    val id: Long,
    @JsonProperty("user_name")
    val name: String,
    @JsonProperty("email")
    val email: String,
)
