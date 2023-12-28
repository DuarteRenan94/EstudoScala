package com.renanduarte.scala
package entidades

abstract class Pessoa {
  private var _nome:String = ""
  private var _idade:Int = 0

  def nome: String = _nome
  def nome(oNome: String): Unit = _nome = oNome

  def idade: Int = _idade
  def idade(aIdade: Int): Unit = _idade = aIdade

}
