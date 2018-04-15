package hofunctions

object URLBuilder {

  def urlBuilde(ssl:Boolean, domainName:String): (String,String)=>String ={

    val schema=if(ssl) "https://" else "http://"

    (endpoint:String, query:String)=>s"$schema$domainName/$endpoint/$query"

  }

}
