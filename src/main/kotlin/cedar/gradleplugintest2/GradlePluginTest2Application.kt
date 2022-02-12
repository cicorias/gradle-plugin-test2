package cedar.gradleplugintest2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradlePluginTest2Application

fun main(args: Array<String>) {
    runApplication<GradlePluginTest2Application>(*args)
}
