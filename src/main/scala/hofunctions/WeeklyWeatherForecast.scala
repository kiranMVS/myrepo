package hofunctions

case class WeeklyWeatherForecast(temperature:Seq[Double]) {

  println("WeeklyWeatherForecast case class")

  private def convertCtoF(temp:Double):Double= temp*1.8+32

  val foreignheitTemperature= temperature.map(convertCtoF(_))

}
