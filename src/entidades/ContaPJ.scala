package com.renanduarte.scala
package entidades

class ContaPJ(oTitular:PessoaJuridica, agencia:String, conta:String) extends Conta{
  private val _titular:PessoaJuridica = oTitular

  def titular:PessoaJuridica = _titular

  override def exibirExtrato: Unit = {
    println(
      s"""
         | ${AppData.NOME_APLICACAO}
         | AG: $agencia
         | Conta: $conta
         | Razão Social: ${titular.nome}
         | Saldo: $saldo
         |""".stripMargin)
  }
}
