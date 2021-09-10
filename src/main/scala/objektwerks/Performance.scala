package objektwerks

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

object Peformance extends LazyLogging {
  val conf = ConfigFactory.load("app.conf")
  val store = Store(conf)
  logger.info("Database and Store initialized for performance testing.")
}

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
class Performance() {
  import Peformance.store

  @Benchmark
  def addTodo(): Int = store.addTodo(Todo(task = "todo"))

  @Benchmark
  def listTodos(): Seq[Todo] = store.listTodos()
}