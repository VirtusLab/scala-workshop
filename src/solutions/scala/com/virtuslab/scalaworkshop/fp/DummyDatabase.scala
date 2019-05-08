package com.virtuslab.scalaworkshop.fp

object DummyDatabase {
  private val companies = Seq(
    Company("Google", 123456),
    Company("Facebook", 654321),
    Company("Amazon", 789123)
  )

  def getCompanyByName(name: String): Either[Exception, Company] = {
    companies.find(_.name == name) match {
      case Some(company) => Right(company)
      case None => Left(new Exception("company not found"))
    }
  }
}
