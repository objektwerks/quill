package objektwerks

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

import scala.concurrent.duration._
import scala.language.postfixOps

object Peformance extends LazyLogging {
  logger.info("Database and Repository initialized for performance testing.")
}

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
class Performance() {
  @Setup
  def setup(): Unit = createSchema()

  @TearDown
  def teardown(): Unit = {
    dropSchema()
    close()
  }

  @Benchmark
  def addRole(): Int = await( roles.add( Role(name = UUID.randomUUID.toString) ) )

  @Benchmark
  def listRoles(): Seq[String] = await( roles.list() )
}