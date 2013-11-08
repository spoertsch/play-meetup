package models

case class UserOrder(user: String, userOrderItems: List[UserOrderItem])

object UserOrder {
  def dummy = List(
      UserOrder("jst", UserOrderItem(Coffee("Lungo 1"), 10) :: UserOrderItem(Coffee("Lungo 2"), 30) :: Nil), 
      UserOrder("thi", UserOrderItem(Coffee("Lungo 5"), 20) :: UserOrderItem(Coffee("Lungo 8"), 10) :: Nil))
}