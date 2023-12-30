package com.renanduarte.estudoscala.entidades

abstract class Conta {
  //Valores default, caso contrário, seriam campos abstratos 
  private var _saldo:Double = 0.0
  private var _agencia = Agencia()
  private var _banco = Banco()
  private var _numero:String = ""
  
  //Getters e setters
  def saldo:Double = _saldo
  def saldo(oSaldo:Double):Unit = _saldo = oSaldo
  
  def agencia:Agencia = _agencia
  def agencia(aAgencia:Agencia):Unit = _agencia = aAgencia
  
  def banco:Banco = _banco
  def banco(oBanco:Banco):Unit = _banco = oBanco
  
  def numero:String = _numero
  def numero(oNumero:String):Unit = _numero = oNumero
  
  //Método comum a todas as findAll, com algumas particularidades
  def exibirExtrato():Unit
}
