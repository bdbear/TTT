

class PrintBoard { 
    println("   |   |   ")                           
    println(" " + Cell(0,0).token +" | " + Cell(0,1).token +" | " + Cell(0,2).token +" ")
    println("___|___|___")                        
    println("   |   |   ")                        
    println(" " + Cell(1,0).token +" | " + Cell(1,1).token +" | " + Cell(1,2).token +" ")
    println("___|___|___")                        
    println("   |   |   ")                       
    println(" " + Cell(2,0).token +" | " + Cell(2,1).token +" | " + Cell(2,2).token +" ")                 
    println("   |   |   ")
}