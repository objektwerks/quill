package objektwerks

import com.typesafe.config.ConfigFactory

import java.util.UUID
import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

object Performance {
  val conf = ConfigFactory.load("store.conf")
  val store = Store(conf)
}

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Fork(1)
class Performance() {
  import Performance.store
  
  var todo = Todo(task = "")

  @Benchmark
  def addTodo(): Todo = {
    todo = todo.copy(task = UUID.randomUUID.toString)
    val id = store.addTodo(todo)
    todo.copy(id = id)
  }

  @Benchmark
  def updateTodo(): Boolean = {
    todo = todo.copy(task = UUID.randomUUID.toString)
    store.updateTodo(todo)
  }

  @Benchmark
  def listTodos(): Seq[Todo] = store.listTodos()
}