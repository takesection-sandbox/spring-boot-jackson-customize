import java.time.LocalDateTime
import java.time.Instant
import java.time.ZoneId

package jp.pigumer {


  object Demo {

    implicit def longToLocalDateTime(l: Long): LocalDateTime =
      LocalDateTime.ofInstant(Instant.ofEpochMilli(l), ZoneId.of("Etc/GMT"))


    def foo: LocalDateTime = longToLocalDateTime(0l)

    def exists(param: String): String = if (null == param) "null" else "not null"
  }
}
