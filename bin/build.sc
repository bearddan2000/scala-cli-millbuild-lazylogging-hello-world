import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object HelloWorld extends ScalaModule {
    def scalaVersion = "2.13.0"

    def ivyDeps = Agg(
        ivy"com.typesafe.scala-logging::scala-logging:3.9.2",
        ivy"ch.qos.logback:logback-classic:1.2.3"
    )
}
