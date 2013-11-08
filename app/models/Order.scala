package models

import org.joda.time.DateTime

case class Order(dueDate: DateTime, availableCoffees: List[Coffee], userOrders: List[UserOrder])

object Order {
  def dummy = {
    Order(new DateTime, Coffee.coffees, UserOrder.dummy)
  }
}