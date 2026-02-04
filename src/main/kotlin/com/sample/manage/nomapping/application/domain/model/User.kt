package com.sample.manage.nomapping.application.domain.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull

@Entity
@Table(name = "users1")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @JsonProperty(value = "user_id", access = JsonProperty.Access.READ_ONLY)
    val id: Long?,
    @get:NotNull
    @JsonProperty("user_name")
    val name: String?,
    @get:NotNull
    @JsonProperty("email")
    val email: String?,
    @get:NotNull
    @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
    val password: String?,
) {
    fun someBusinessLogic(): String = "User: $name, Email: $email"

    fun hogeBusinessLogic(): String = "Hoge logic for user $name"
}
