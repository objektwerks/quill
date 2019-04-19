package quill

import com.typesafe.config.ConfigFactory
import org.scalatest.FunSuite

class StoreTest extends FunSuite {
  val conf = ConfigFactory.load("test.conf")

  test("store") {
    val store = Store(conf)
    val todo = Todo(task = "wash car")
    assert( store.addTodo(todo) > 0 )
    store.updateTodo(todo.copy(task = "wash and dry car"))
    assert( store.listTodos().nonEmpty )
  }
}