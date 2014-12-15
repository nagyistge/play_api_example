package controllers

import actions.JsonAPIAction
import models.TopLevel
import play.api.libs.json.Json
import play.api.mvc._

object Application extends Controller {

  def index = JsonAPIAction {
    val services = Map("users"-> "/users")
  	Ok(Json.toJson(TopLevel(links=Some(services))))
  }

}
