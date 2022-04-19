# playframework/twirl/pull/506

```console
$ echo 'sbt.version=1.7.0-M2' > project/build.properties
$ sbt compile
[info] welcome to sbt 1.7.0-M2 (AdoptOpenJDK Java 1.8.0_292)
[info] loading settings for project global-plugins from plugins.sbt,sbt-musical.sbt ...
[info] loading global plugins from /Users/toshi/.sbt/1.0/plugins
[info] loading settings for project twirl-example-build-build-build from metals.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project/project/project
[info] loading settings for project twirl-example-build-build from metals.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project/project
[success] Generated .bloop/twirl-example-build-build.json
[success] Total time: 0 s, completed 2022/04/19 22:42:35
[info] loading settings for project twirl-example-build from metals.sbt,plugins.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project
[success] Generated .bloop/twirl-example-build.json
[success] Total time: 0 s, completed 2022/04/19 22:42:35
[info] loading settings for project twirl-example from build.sbt ...
[info] set current project to twirl-example (in build file:/Users/toshi/tmp/twirl-example/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 1 Scala source to /Users/toshi/tmp/twirl-example/target/scala-3.1.2/classes ...
[error] /Users/toshi/tmp/twirl-example/src/main/twirl/error.scala.html:1:12: Not found: world
[error] <h1>Hello @world</h1>
[error]            ^
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 3 s, completed 2022/04/19 22:42:39
$ echo 'sbt.version=1.7.0-M1' > project/build.properties
$ sbt compile
[info] welcome to sbt 1.7.0-M1 (AdoptOpenJDK Java 1.8.0_292)
[info] loading settings for project global-plugins from plugins.sbt,sbt-musical.sbt ...
[info] loading global plugins from /Users/toshi/.sbt/1.0/plugins
[info] loading settings for project twirl-example-build-build-build from metals.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project/project/project
[info] loading settings for project twirl-example-build-build from metals.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project/project
[success] Generated .bloop/twirl-example-build-build.json
[success] Total time: 1 s, completed 2022/04/19 22:43:24
[info] loading settings for project twirl-example-build from metals.sbt,plugins.sbt ...
[info] loading project definition from /Users/toshi/tmp/twirl-example/project
[success] Generated .bloop/twirl-example-build.json
[success] Total time: 1 s, completed 2022/04/19 22:43:26
[info] loading settings for project twirl-example from build.sbt ...
[info] set current project to twirl-example (in build file:/Users/toshi/tmp/twirl-example/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 1 Scala source to /Users/toshi/tmp/twirl-example/target/scala-3.1.2/classes ...
[error] -- [E006] Not Found Error: /Users/toshi/tmp/twirl-example/target/scala-3.1.2/twirl/main/html/error.template.scala:19:63
[error] 19 |Seq[Any](format.raw/*1.1*/("""<h1>Hello """),_display_(/*1.12*/world),format.raw/*1.17*/("""</h1>
[error]    |                                                               ^^^^^
[error]    |                                                        Not found: world
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 3 s, completed 2022/04/19 22:43:30
```
