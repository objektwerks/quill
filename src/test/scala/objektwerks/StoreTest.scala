package objektwerks

import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class StoreTest extends AnyFunSuite with Matchers {
  val conf = ConfigFactory.load("test.conf")

  test("store") {
    val store = Store(conf)

    val todo = Todo(task = "wash car")
    val id = store.addTodo(todo)
    println(s"*** Todo Add: $id")
    id shouldBe 1

    val todoWithId = todo.copy(id = id)
    println(s"*** Todo Update: $todoWithId")
    store.updateTodo(todoWithId.copy(task = "wash and dry car"))
    
    val todos = store.listTodos()
    println(s"*** List Todos: ${todos.toString}")
    todos.length shouldBe 1
  }
}