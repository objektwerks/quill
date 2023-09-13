package objektwerks

import com.typesafe.config.Config

import io.getquill._

object Store {
  def apply(config: Config): Store = new Store(config)
}

final class Store(config: Config) {
  private val ctx = new H2JdbcContext(SnakeCase, config.getConfig("quill.ctx"))
  import ctx._

  def addTodo(todo: Todo): Int =
    run( query[Todo].insert(lift(todo)).returningGenerated(_.id) )

  def updateTodo(todo: Todo): Boolean = {
    run( query[Todo].filter(_.id == lift(todo.id)).update(lift(todo)) )
    true
  }

  def listTodos(): Seq[Todo] = run( query[Todo] )
}