Quill
-----
>Quill feature tests. **WARNING** Any Quill version beyond 3.0.1 breaks the unit test.

Test
----
1. sbt clean test

Bloop
-----
1. sbt bloopInstall
2. bloop projects
3. bloop clean quill
4. bloop compile quill
5. bloop test quill