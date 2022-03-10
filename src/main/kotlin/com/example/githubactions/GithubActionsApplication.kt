package com.example.githubactions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubActionsApplication

fun main(args: Array<String>) {
	runApplication<GithubActionsApplication>(*args)
}
