package com.renanduarte.estudoscala.entidades
import com.renanduarte.estudoscala.AppData

class ContaPF(oTitular:PessoaFisica, agencia:String, conta:String) extends Conta{
  private val _titular:PessoaFisica = oTitular

  def titular:Pessoa = _titular

  super.agencia(agencia)
  super.conta(conta)

  override def exibirExtrato:Unit =
    println(s"""
      | ${AppData.NOME_APLICACAO}
      | AG: $agencia
      | Conta: $conta
      | Titular: ${titular.nome}
      | Saldo: $saldo
      |""".stripMargin)
}
