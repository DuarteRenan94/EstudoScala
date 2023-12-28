package com.renanduarte.scala
package entidades

import scala.annotation.tailrec

class PessoaJuridica extends Pessoa{
  private var _cnpj:String = "00.000.000/0001-00"

  private var _funcionarios:List[PessoaFisica] = List()

  def cnpj:String = _cnpj
  def cnpj(oCNPJ:String):Unit = _cnpj = oCNPJ

  //contrato CLT
  def contratar(oFunca: PessoaFisica): Unit = {
    if (!_funcionarios.contains(oFunca)) _funcionarios = _funcionarios ++ List(oFunca)
  }

  //demissão aplicando filtro tipo Java 8 stream
  def demitir(oFunca: PessoaFisica): Unit = _funcionarios = _funcionarios.filter(p => p != oFunca)

  //caso base
  @tailrec
  private def listar(xs:List[PessoaFisica]):Unit = xs match
    case Nil =>
    case head :: tail => println(s"Dados do funcionário: $head");listar(tail)
    
  def listaFuncionarios():Unit = listar(_funcionarios)
}
