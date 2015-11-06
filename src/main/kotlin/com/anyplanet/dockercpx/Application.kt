package com.anyplanet.dockercpx

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {

    val logger = LoggerFactory.getLogger(Application::class.java)

    @Bean
    open fun commandLineRunner(): CommandLineRunner {

        return CommandLineRunner {
            logger.info("{}", it)
        }

    }

    companion object App {
        @JvmStatic public fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}