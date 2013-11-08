package controllers

import play.api._
import play.api.mvc._
import models.Coffee
import models.Order

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("IPSpresso", Order.dummy))
  }

}