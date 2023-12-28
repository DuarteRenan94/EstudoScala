package com.renanduarte.scala
package entidades

abstract class Conta {
  //Valores default, caso contrário, seriam campos abstratos
  private var _saldo:Double = 0.0
  private var _agencia:String = ""
  private var _conta:String = ""
  
  //Getters
  def agencia:String = _agencia
  def conta:String = _conta
  def saldo:Double = _saldo
  
  //Setters
  def agencia(aAgencia:String):Unit = _agencia = aAgencia
  def conta(aConta:String):Unit = _conta = aConta
  
  //Operações básicas
  def depositar(quantia: Double): Unit = _saldo += quantia
  private def saldoSuficiente(quantia: Double): Boolean = _saldo > 0.0 && quantia <= _saldo
  def sacar(quantia: Double): Unit = if (saldoSuficiente(quantia)) _saldo -= quantia
  def transferir(outraConta: Conta, quantia: Double): Unit = {
    if (saldoSuficiente(quantia)) sacar(quantia);
    outraConta.depositar(quantia)
  }
  
  //Método comum a todas as contas, com algumas particularidades
  def exibirExtrato:Unit
}
