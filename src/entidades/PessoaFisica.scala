package com.renanduarte.scala
package entidades

class PessoaFisica extends Pessoa{
  private var _cpf:String = "000.000.000-00"
  
  def cpf:String = _cpf
  def cpf(oCPF:String):Unit = _cpf = oCPF
  
  override def toString:String =
    s"""
      | Nome: $nome
      | Idade: $idade
      | CPF: $cpf
      |""".stripMargin
}
