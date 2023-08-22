# Demo Redis ACL connection for Scala
Setup credentials for Redis
```
...
REDIS_ARGS: "--requirepass password --user username on >password ~* allcommands --user default off nopass nocommands"
...
```

Redis authentication string configured
```scala
...
val cli = RedisClient.create("redis://username:password@redis:6379/");
...
```

Example run (assembly step might takes a while)

```sh
docker compose run demo
[+] Creating 1/0
 ✔ Container redis-acl-redis-1  Running                                                                                                                                                  0.0s 
Insert key-value pair: test_key-789 to test
Value received from the Redis for test_key: 789. Removing test key . . .
Done. Exiting . . .
```
