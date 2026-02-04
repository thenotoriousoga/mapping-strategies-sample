package com.sample.manage.twoway.application.port.input

import com.sample.manage.twoway.application.domain.model.User

interface RegisterUserUseCase {
    /**
     * ユーザーを登録する
     *
     * @param user 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(user: User): User
}
