

object Line extends Enumeration {
    protected case class TriLocation(location0: Location, location1: Location, location2: Location) extends super.Val {
    }
  
  val row0 = TriLocation(Location(0,0), Location(0,1), Location(0,2))
  val row1 = TriLocation(Location(1,0), Location(1,1), Location(1,2))
  val row2 = TriLocation(Location(2,0), Location(2,1), Location(2,2))
  val column0 = TriLocation(Location(0,0), Location(1,0), Location(2,0))
  val column1 = TriLocation(Location(0,1), Location(1,1), Location(2,1))
  val column2 = TriLocation(Location(0,2), Location(1,2), Location(2,2))
  val diagonal0 = TriLocation(Location(0,0), Location(1,1), Location(2,2))
  val diagonal1 = TriLocation(Location(0,2), Location(1,1), Location(2,0))
  
}