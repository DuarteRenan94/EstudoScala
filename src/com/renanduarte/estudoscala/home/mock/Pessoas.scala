package com.renanduarte.estudoscala.home.mock

import com.renanduarte.estudoscala.entidades.PessoaFisica

object Pessoas {
  val lista = List(
    new PessoaFisica(){
      nome("Renan Duarte")
      idade(29)
      cpf("000.000.000-00")
    },
    new PessoaFisica(){
      nome("Ronaldo Silva")
      idade(40)
      cpf("111.000.000-00")
    },
    new PessoaFisica(){
      nome("Cássio Tubarão")
      idade(30)
      cpf("111.222.000-00")
    }
  )
}
