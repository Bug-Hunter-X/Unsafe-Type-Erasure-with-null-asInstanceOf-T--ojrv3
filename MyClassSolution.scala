```scala
class MyClass[T](val value: T) {
  def this(value: T = null) = this(if (value == null) null.asInstanceOf[T] else value)
}

// Better solution using Option
class MyClass2[T](val value: Option[T]) {
  def this() = this(None)
  def this(value: T) = this(Some(value))
}
```