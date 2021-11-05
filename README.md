Quill
-----
>Quill feature tests and performance benchmark.

Test
----
1. sbt clean test

Benchmark
---------
1. sbt jmh:run

Results
-------
>OpenJDK 64-Bit Server VM (Zulu 8.56.0.23-CA-macos-aarch64) (build 25.302-b08, mixed mode)
1. addTodo - 21.284
2. listTodos - 3.375
3. updateTodo - 6.536
>Total time: 607 s (10:07), 10 warmups, 10 iterations, in microseconds, completed 2021.11.5