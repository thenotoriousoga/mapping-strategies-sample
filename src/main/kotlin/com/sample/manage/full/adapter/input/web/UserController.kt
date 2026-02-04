package com.sample.manage.full.adapter.input.web

import com.sample.manage.full.adapter.input.web.mapper.toCommand
import com.sample.manage.full.adapter.input.web.mapper.toResponse
import com.sample.manage.full.adapter.input.web.model.RegisterUserRequest
import com.sample.manage.full.adapter.input.web.model.RegisterUserResponse
import com.sample.manage.full.application.port.input.RegisterUserUseCase
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("full/users")
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
        val registeredUserResult = registerUserUseCase.registerUser(request.toCommand())
        return registeredUserResult.toResponse()
    }
}
