package hofunctions

object HOFunctionTest extends App {

  val wwfc= new WeeklyWeatherForecast(Seq(100.0, 101.0,102.0))

  println(wwfc.foreignheitTemperature)


  val smallPromotion= SalaryRaiser.promotion(List(1000.0, 2000.0, 3000.0), salary=>salary*1.1)
  val greatPromotion = SalaryRaiser.promotion(List(1000.0, 2000.0, 3000.0), salary=>salary*math.log(salary))
  val hugePromotion= SalaryRaiser.promotion(List(1000.0, 2000.0, 3000.0), salary=>salary*salary)

  println(smallPromotion)
  println(greatPromotion)
  println(hugePromotion)

  val getSSLURL = URLBuilder.urlBuilde(true,"scala.com")
  val getURL = URLBuilder.urlBuilde(false,"scala.com")
  val url="downloads"
  val query="version=1.0"

  println(getSSLURL(url,query))
  println(getURL(url,query))

}
