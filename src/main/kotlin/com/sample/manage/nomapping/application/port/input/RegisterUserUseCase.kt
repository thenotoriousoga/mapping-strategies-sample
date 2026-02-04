package com.sample.manage.nomapping.application.port.input

import com.sample.manage.nomapping.application.domain.model.User

interface RegisterUserUseCase {
    /**
     * ユーザーを登録する
     *
     * @param user 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(user: User): User
}
