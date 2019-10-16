val foo: Either[Exception, String] = Right("Hello")
val bar: Either[Exception, String] = Left(new Exception("Something wrong"))


foo.map(x => x + "World")  // --> Right("HelloWorld")
bar.map(x => x + "World")  // --> still Left(Exception("Something wrong"))

foo.flatMap { case x: String => Left(new Exception("")) }  // --> Left(OtherExpection(""))
bar.flatMap((x: String) => Left(new Exception("")))  // --> still Left(Exception("Something wrong"))

foo.flatMap(x => Right(x + "World"))  // --> Right("HelloWorld")
bar.flatMap(x => Right(x + "World"))