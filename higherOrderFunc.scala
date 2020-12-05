/*Illustration of utility of higher order & anonymous function in scala
 Ask is to define 2 functions which return - a) sum of all numbers for a given range defined by lower bound and upper bound
 and b) sum of square of all numbers for a given range defined by lower bound and upper bound
 Normal approach */

//sum of numbers
def sum(lb:Int,ub:Int):Int = {
     var total = 0
     for(i <- lb to ub){
     total += i
     }
     total
}
//sum(1,4) => returns 10
	
//sum of square of numbers	
def sumSquare(lb:Int,ub:Int):Int = {
     var total = 0
     for(i <- lb to ub){
     total += i*i
     }
     total
}
//sumSquare(1,4) => returns 30

//Scala approach higher order function
def sumHO(func: Int => Int, lb:Int,ub:Int) = {
      var total = 0
      for(i <- lb to ub){
      total += func(i)
      }
      total
      }
 def id(num:Int) = {num}
 
 def sqr(num:Int) = {num*num}
 /*sumHO(id,1,4) => returns 10
 sumHO(sqr,1,4) => returns 30
 Don't want to create extra functions like id & sqr, call sumHO like this :
 sumHO(i => i*i,1,4) => returns 30
 sumHO(i => i,1,4) => returns 10 */
