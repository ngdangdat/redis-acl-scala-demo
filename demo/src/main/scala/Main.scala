package com.ngdangdat

import io.lettuce.core.RedisClient
import scala.util.Random

object Main extends App {
  val cli = RedisClient.create("redis://username:password@redis:6379/");
  val conn = cli.connect()
  val commands = conn.sync()
  val testKey = "test_key"
  val testVal = Random.between(10, 1000)
  println(s"Insert key-value pair: $testKey-$testVal to test")
  commands.set(testKey, testVal.toString)

  val result = commands.get(testKey)
  println(s"Value received from the Redis for $testKey: $result. Removing test key . . .")
  commands.del(testKey)
  println("Done. Exiting . . .")
}