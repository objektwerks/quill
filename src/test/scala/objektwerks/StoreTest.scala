package objektwerks

import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

final class StoreTest extends AnyFunSuite with Matchers {
  val config = ConfigFactory.load("test.conf")
  val store = Store(config)

  test("store") {
    val todo = Todo(task = "wash car")
    val id = store.addTodo(todo)
    println(s"*** Add Todo: $id")
    id shouldBe 1

    val todoWithId = todo.copy(id = id)
    println(s"*** Update Todo: $todoWithId")
    val updatedTodo = todoWithId.copy(task = "wash and dry car")
    val updated = store.updateTodo(updatedTodo)
    updated shouldBe true

    val todos = store.listTodos()
    println(s"*** List Todos: ${todos.toString}")
    todos.length shouldBe 1
  }
}