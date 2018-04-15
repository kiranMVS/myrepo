package objecttest

object CompanionTest extends App {

  class Email(val userName:String, val domainName:String)

  object Email{

    def fromEmail(emailString:String):Option[Email]={

      emailString.split('@') match {
        case Array(a,b)=> Some(new Email(a,b))
        case _=>None
      }

    }

  }

  val scalaCenterEmail = Email.fromEmail("scalacenter@ephl.com")
  scalaCenterEmail match {

    case Some(email:Email)=> println(s"""Registered an Email
      |UserName: ${email.userName}
      |DomainName:${email.domainName}}""")

    case None => println("Error: Can't parse the email")
  }

}
