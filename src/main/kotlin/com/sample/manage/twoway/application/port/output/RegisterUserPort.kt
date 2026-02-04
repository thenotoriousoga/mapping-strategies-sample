package com.sample.manage.twoway.application.port.output

import com.sample.manage.twoway.application.domain.model.User

interface RegisterUserPort {
    /**
     * ユーザーを登録する
     *
     * @param user 登録するユーザー情報
     * @return 登録されたユーザー情報
     */
    fun registerUser(user: User): User
}
