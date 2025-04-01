package renov8.renov8configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ReNov8ConfigServerApplication

fun main(args: Array<String>) {
    runApplication<ReNov8ConfigServerApplication>(*args)
}