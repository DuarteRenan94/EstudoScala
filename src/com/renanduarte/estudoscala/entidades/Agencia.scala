package com.renanduarte.estudoscala.entidades

class Agencia {
  //Na linguagem scala, os membros da classe são públicos
  private var _cod = String()
  private var _banco = Banco()

  def cod:String = _cod
  def cod(oCod:String):Unit = _cod = oCod


  def banco:Banco = _banco
  def banco(oBanco: Banco):Unit = _banco = oBanco

  override def toString:String = {
    s"""
       | Agência: $cod
       | $banco
       | Endereço: Ainda não implementado
       |""".stripMargin
  }
}
