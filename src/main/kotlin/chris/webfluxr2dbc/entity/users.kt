package chris.webfluxr2dbc.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigInteger
import java.time.LocalDateTime

@Table("users")
class users(
  @Id
  val id: BigInteger? = null,
  val email: String,
  val username: String,
  val password: String,
  val profile_url: String,
  val created_at: LocalDateTime? = null,
  val updated_at: LocalDateTime? = null,
)