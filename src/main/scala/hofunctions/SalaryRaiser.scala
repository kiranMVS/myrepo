package hofunctions

object SalaryRaiser {

  def promotion(salary:List[Double], promotionFuction:Double=>Double):List[Double]={

    salary.map(promotionFuction(_))

  }

}
