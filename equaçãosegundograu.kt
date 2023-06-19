 import kotlin.math.*
fun main() {
 //pede para o usuario entrar com os números pritln
  println("Calculo de raizes de uma equação")
  println("Uma equação do segundo grau segue o seguinte padrão:")
  println("ax2+bx+c")
  println("digite o coeficiente  a: ")
  var num1=readLine()!!
  println("digite o coeficiente b: ")
  var num2=readLine()!!
  println("digite o coeficiente c: ")
  var num3=readLine()!!
//exibir números digitados 
  println ("Você digitou a:"+num1+",b:"+num2+",c:"+num3)

//transforma texto(String) digitado em dadao Double 
  var a:Double=num1.toDouble()
  var b:Double=num2.toDouble()
  var c:Double=num3.toDouble()

  println("números do tipo Double-> a:"+a+"x2+"+b+"x+"+c+"=0")
//calculo de delta 
  var delta:Double=(b*b)-(4*a*c)
  println("O Delta é: "+delta)
  var raizdelta=sqrt(delta)
  println("A raiz de delta é: "+raizdelta)
//calculo de x1
  var x1=(-b+raizdelta)/(2*a)
  println("x1: "+x1)
//calculo de x2
  var x2=(-b-raizdelta)/(2*a)
  println("x2: "+x2) 
}
