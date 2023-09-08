package objektwerks

import com.typesafe.config.ConfigFactory

import java.util.UUID
import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
class Performance() {
  val conf = ConfigFactory.load("app.conf")
  val store = Store(conf)
  var todo = Todo(0, "")

  println("*** Database and Store initialized for performance testing.")

  @Benchmark
  def addTodo(): Int = {
    todo = todo.copy(task = UUID.randomUUID.toString)
    val id = store.addTodo(todo)
    todo = todo.copy(id = id)
    id
  }

  @Benchmark
  def updateTodo(): Boolean = {
    todo = todo.copy(task = UUID.randomUUID.toString)
    store.updateTodo(todo)
  }

  @Benchmark
  def listTodos(): Seq[Todo] = store.listTodos()
}