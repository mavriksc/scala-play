object FrogJump {

  def genPaths(n: Int): List[List[Int]] = if (n == 10) List(List()) else List.range(n + 1, 11).flatMap(genPaths(_).map(n :: _))
  def pathProb(path: List[Int]): Double = path.map(n => 1 / (10 - n.toDouble)).product



  def main(args:Array[String]): Unit = {
    val paths = genPaths(0)
    print(paths.map(p => p.size * pathProb(p)).sum)
  }

}
