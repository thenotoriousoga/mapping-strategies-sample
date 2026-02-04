package com.sample.manage.oneway.adapter.input.web

import com.sample.manage.oneway.adapter.input.web.model.RegisterUserRequest
import com.sample.manage.oneway.adapter.input.web.model.RegisterUserResponse
import com.sample.manage.oneway.application.port.input.RegisterUserUseCase
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("oneway/users")
class UserController(
    val registerUserUseCase: RegisterUserUseCase,
) {
    /**
     * ユーザー登録
     *
     * @param request ユーザー情報リクエスト
     * @return 登録したユーザー情報レスポンス
     */
    @PostMapping
    fun registerUser(
        @RequestBody @Validated request: RegisterUserRequest,
    ): RegisterUserResponse {
        val registeredUser = registerUserUseCase.registerUser(request)
        return RegisterUserResponse(
            id = registeredUser.id!!,
            name = registeredUser.name!!,
            email = registeredUser.email!!,
        )
    }
}
