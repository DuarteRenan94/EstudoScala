package com.renanduarte.estudoscala.home

import com.renanduarte.estudoscala.entidades.{Agencia, Banco, ContaPF, PessoaFisica}
import com.renanduarte.estudoscala.home.mock.ContaManager

import scala.annotation.tailrec

object ContaPFHome {

  def cadastrar(oTitular:PessoaFisica, 
                aAgencia:Agencia, 
                oBanco:Banco, 
                oNumero:String):Unit = {
    val c = ContaPF()
    c.titular(oTitular)
    c.agencia(aAgencia)
    c.banco(oBanco)
    c.numero(oNumero)
    ContaManager.persist(c)
  }
  
  @tailrec
  private def e(xs:List[ContaPF]):Unit = {
    xs match
      case Nil =>
      case h :: t => println(h);e(t)
  }
  
  def exibir():Unit = {
    println("| Resultados da busca |")
    e(ContaManager.findAll)
    println(s"${ContaManager.findAll.size} resultado(s)")
  }
  
  def buscarContasPeloTitular(oTitular: PessoaFisica):List[ContaPF] = 
    ContaManager.findByCriteria(_.titular.equals(oTitular))
    
  def buscarContasPeloNomeDoTitular(oNome: String):List[ContaPF] =
    ContaManager.findByCriteria(_.titular.nome.equals(oNome))
}
