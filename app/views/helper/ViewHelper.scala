package views.helper

import org.joda.time.format.DateTimeFormat
import org.joda.time.DateTime

object ViewHelper {
  def formatJodaDateTime(date: DateTime, pattern: String = "yyyy-MM-dd") = DateTimeFormat.forPattern(pattern).print(date)
}