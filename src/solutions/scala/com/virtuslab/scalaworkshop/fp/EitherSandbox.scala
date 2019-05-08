package com.virtuslab.scalaworkshop.fp

case class Company(name: String, taxId: Int)

object EitherSandbox {

  def getCompanyTaxId(params: Map[String, String]): Either[Exception, Int] = {
    // TODO: try combining Option and Either in a single `for` comprehension...
    for {
      name <- params.get("companyName").toRight(new Exception("param not found"))
      company <- DummyDatabase.getCompanyByName(name)
    } yield company.taxId
  }
}
