//criar uma função passando um parâmetro 
fun meuNome(nome:String){
  println("Seu nome é: "+nome)
}
//crie uma função que retorna true ou false,passando parâmetro x na chamada da função
fun veroufalso(x:Boolean) {
  println(x)
}
//crie uma função que verifica a idade passada como parâmetro, se é maior de idade 
fun seramaior(y:Int){
  if(y>=18){
    println("É maior de idade: " + y)
  }else{
    println("É menor de idade: " + y)
  }
}

//cire uma função que passa dois parâmentros inteiros a e b, a função retorna a soma dos dois valores

fun soma(a: Int, b: Int): Int {
  return (a + b)
}


//função principal kotlin
fun main() {
  meuNome("Ana")
  veroufalso(false)
  veroufalso(true)

  seramaior(15)
  seramaior(19)  

   var resultado = soma(290, 6)
   println(resultado)
}
