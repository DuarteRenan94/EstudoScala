package com.renanduarte.estudoscala.home.mock

import com.renanduarte.estudoscala.data.Operacoes
import com.renanduarte.estudoscala.entidades.ContaPF

object ContaManager extends Operacoes[ContaPF]{
  private var _contas:List[ContaPF] = List()
  
  override def persist(c:ContaPF):Unit = _contas = _contas ++ List(c)
  
  override def findAll:List[ContaPF] = _contas
  
  override def findByCriteria(criteria: ContaPF => Boolean):List[ContaPF] = _contas.filter(criteria)
}
