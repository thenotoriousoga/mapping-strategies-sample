import com.sample.manage.twoway.adapter.input.web.model.RegisterUserRequest
import com.sample.manage.twoway.adapter.input.web.model.RegisterUserResponse
import com.sample.manage.twoway.application.domain.model.User

fun RegisterUserRequest.toDomain(): User =
    User(
        id = null,
        name = this.name!!,
        email = this.email!!,
        password = this.password!!,
    )

fun User.toResponse(): RegisterUserResponse =
    RegisterUserResponse(
        id = this.id!!,
        name = this.name,
        email = this.email,
    )
