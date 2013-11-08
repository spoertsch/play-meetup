package models

case class Coffee(name: String)

object Coffee {

  def coffees = List(
    Coffee("Lungo 1"),
    Coffee("Lungo 2"), 
    Coffee("Lungo 3"), 
    Coffee("Lungo 4"), 
    Coffee("Lungo 5"),
    Coffee("Lungo 6"),
    Coffee("Lungo 7"),
    Coffee("Lungo 8"),
    Coffee("Lungo 9"),
    Coffee("Lungo 10"))
}