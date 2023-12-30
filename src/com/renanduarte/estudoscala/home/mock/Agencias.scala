package com.renanduarte.estudoscala.home.mock

import com.renanduarte.estudoscala.entidades.Agencia
import com.renanduarte.estudoscala.home.mock.Bancos.bancoTeste

object Agencias {
  
  val agenciaA = Agencia()
  agenciaA.cod("1212")
  agenciaA.banco(bancoTeste)
  
  val agenciaB = Agencia()
  agenciaB.cod("1010")
  agenciaB.banco(bancoTeste)
  
}
