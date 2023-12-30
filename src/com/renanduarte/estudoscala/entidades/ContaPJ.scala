package com.renanduarte.estudoscala.entidades


class ContaPJ extends Conta{
  private var _titular:PessoaJuridica = PessoaJuridica()
  
  def titular:PessoaJuridica = _titular
  def titular(oTitular:PessoaJuridica):Unit = _titular = oTitular

  override def exibirExtrato(): Unit = {
    println(
      s"""
         $agencia
         | Conta: $numero
         | Razão Social: ${_titular.nome}
         | Saldo: $saldo
         |""".stripMargin)
  }
}
