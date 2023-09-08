package objektwerks

import com.typesafe.config.ConfigFactory

import org.scalatest.funsuite.AnyFunSuite

class StoreTest extends AnyFunSuite {
  val conf = ConfigFactory.load("test.conf")

  test("store") {
    val store = Store(conf)

    val todo = Todo(task = "wash car")
    val id = store.addTodo(todo)
    println(s"*** Todo Add: $id")
    assert( id > 0 )

    val todoWithId = todo.copy(id = id)
    println(s"*** Todo Update: $todoWithId")
    store.updateTodo(todoWithId.copy(task = "wash and dry car"))
    
    val todos = store.listTodos()
    println(s"*** List Todos: ${todos.toString}")
    assert( todos.nonEmpty )
  }
}