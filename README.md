Quill
-----
>Quill feature test and performance benchmark against H2.

Test
----
1. sbt clean test

Benchmark
---------
>See Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu22.28+91-CA (build 22+36), **Scala 3.4.1-RC2**, Apple M1
1. addTodo - 17.064
2. listTodos - 2.815
3. updateTodo - 3.648
>Total time: 604 s (10:04), 10 warmups, 10 iterations, average time in microseconds, completed **2024.3.22**

>OpenJDK Runtime Environment Zulu 8.56.0.23-CA-macos-aarch64 (build 1.8.0_302-b08), **Scala 2.13**, Apple M1
1. addTodo - 21.284
2. listTodos - 3.375
3. updateTodo - 6.536
>Total time: 607 s (10:07), 10 warmups, 10 iterations, average time in microseconds, completed **2021.11.5**