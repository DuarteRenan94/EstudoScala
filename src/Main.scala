import com.renanduarte.estudoscala.AppData
import com.renanduarte.estudoscala.entidades.ContaPF
import com.renanduarte.estudoscala.home.mock.{Agencias, Bancos, Pessoas, ContaManager}
import com.renanduarte.estudoscala.home.ContaPFHome


object Main {
  def main(args: Array[String]): Unit = {
    println(AppData.NOME_APLICACAO)

    ContaPFHome.cadastrar(Pessoas.lista.head,
      Agencias.agenciaA,
      Bancos.bancoTeste,
      "12345-6"
    )

    ContaPFHome.cadastrar(Pessoas.lista.apply(1),
      Agencias.agenciaA,
      Bancos.bancoTeste,
      "12300-4"
    )

    ContaPFHome.cadastrar(Pessoas.lista.apply(2),
      Agencias.agenciaB,
      Bancos.bancoTeste,
      "54321-0"
    )

    ContaPFHome.exibir()
    //Buscando pelo objeto titular
    val titular = Pessoas.lista.apply(1)
    val results = ContaPFHome.buscarContasPeloTitular(titular)
    println(results)
    
    //Buscando pelo nome
    val nome = "Cássio Tubarão"
    val results2 = ContaPFHome.buscarContasPeloNomeDoTitular(nome)
    println(results2)
  }
}