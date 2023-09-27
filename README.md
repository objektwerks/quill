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
>**Warning:** Using JDK 9-21 and sbt-jmh 46, throws: java.lang.ClassNotFoundException: java/sql/ResultSet

>**See:** [Benchmark compilation fails if java.sql.ResultSet is used #192](https://github.com/sbt/sbt-jmh/issues/192)

Results
-------
>OpenJDK Runtime Environment (Zulu 8.56.0.23-CA-macos-aarch64) (build 1.8.0_302-b08)
1. addTodo - 21.284
2. updateTodo - 6.536
3. listTodos - 3.375
>Total time: 607 s (10:07), 10 warmups, 10 iterations, in microseconds, completed 2021.11.5
