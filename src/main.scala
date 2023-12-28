import com.renanduarte.estudoscala.AppData
import com.renanduarte.estudoscala.entidades.{ContaPF, ContaPJ, PessoaFisica, PessoaJuridica}

object Main {
  def main(args: Array[String]): Unit = {
    println(AppData.NOME_APLICACAO)

    val alc = PessoaFisica()
    alc.nome("Alcides")
    alc.cpf("000.111.222-33")
    alc.idade(20)
    val contaAlc:ContaPF = ContaPF(alc, "0001", "12345-6") // Criada a conta do Alcides

    val josefa = PessoaFisica()
    josefa.nome("Josefa")
    josefa.idade(40)
    josefa.cpf("456.123.888-01")
    val contaJos = ContaPF(josefa, "1313", "45612-5")

    //Operações Básicas
    /*
    * Josefa vai transferir R$ 300,00 pro Alcides. Porém, o décimo dela ainda não caiu. O que precisa?
    * Depositar o décimo
    * */
    contaJos.depositar(1500.30) //Agora o natal vai ser bom heheee
    contaJos.exibirExtrato
    contaAlc.exibirExtrato
    contaJos.transferir(contaAlc, 300)
    contaJos.exibirExtrato
    contaAlc.exibirExtrato

    val firma = PessoaJuridica()
    firma.nome("Loja Tudo Barato")
    val caixaEmpresa = ContaPJ(firma, "0001", "13200-4")
    caixaEmpresa.depositar(150000000.50)
    firma.contratar(josefa)
    firma.contratar(alc)
    firma.listaFuncionarios()
    //pagar salário
    caixaEmpresa.exibirExtrato
    caixaEmpresa.transferir(contaJos, 3200)
    caixaEmpresa.transferir(contaAlc, 2500)
    caixaEmpresa.exibirExtrato
    contaAlc.exibirExtrato
    contaJos.exibirExtrato
  }
}