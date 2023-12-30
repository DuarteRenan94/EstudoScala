package com.renanduarte.estudoscala.data


trait Operacoes[T]{
  def persist(c: T): Unit

  def findAll: List[T]

  def findByCriteria(criteria: T => Boolean): List[T]
}
