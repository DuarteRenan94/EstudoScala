package com.renanduarte.estudoscala.entidades

class Banco {
  private var _cod = String() //Código do banco na FEBRABAN
  private var _nome = String()

  def cod:String = _cod
  def cod(oCod:String):Unit = _cod = oCod

  def nome:String = _nome
  def nome(oNome:String):Unit = _nome = oNome

  override def toString:String = s"Banco: $_cod - $_nome"
}
