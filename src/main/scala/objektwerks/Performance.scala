package objektwerks

import com.typesafe.scalalogging.LazyLogging

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

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

}