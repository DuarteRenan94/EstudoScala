package com.renanduarte.estudoscala.entidades

class ContaPF extends Conta{
  private var _titular:PessoaFisica = PessoaFisica()

  def titular:PessoaFisica = _titular
  def titular(oTitular:PessoaFisica):Unit = _titular = oTitular
  override def exibirExtrato():Unit =
    println(s"""
      $agencia
      | Conta: $numero
      | Titular: ${_titular.nome}
      | Saldo: $saldo
      | Movimentação: Ainda não implementado
      |""".stripMargin)

  override def toString:String =
    s"""
       |$agencia
       | Conta: $numero
       | Titular: ${_titular.nome}
       |""".stripMargin
}
