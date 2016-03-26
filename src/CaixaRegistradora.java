import java.util.Scanner;
/**
 * @author Bruno Garcia 	Matricula: 029141072
 * @author Tamires Ferreira Matricula: 029131052
 */
public class CaixaRegistradora {
		
	private static Scanner scanner;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		scanner = new Scanner(System.in);
		System.out.println("MERCADINHO BT");
		System.out.println("Digite a forma de desconto: ");
		String desconto = scanner.nextLine();
		
		//INSIRINDO OS PROTUDOS NO "SISTEMA"
		Produto cafe = new Produto("Café Santa Clara", 4.29);
		Produto arroz = new Produto("Arroz Tio João", 2.11);
		Produto feijao = new Produto("Feijão KiCaldo", 6.89);
		Produto macarrao = new Produto("Macarrão Fortaleza", 2.89);
		
		//CRIANDO UMA VENDA
		Venda venda = new Venda();
		//ADICIONANDO DETERMINADOS PRODUTOS AO CARRINHO DE COMPRAS
		venda.adicionarProduto(macarrao);
		venda.adicionarProduto(feijao);
		venda.adicionarProduto(cafe);
		venda.adicionarProduto(arroz);
		//REMOVENDO UM ELEMENTO DO "CARRINHO"
		venda.removerProduto(macarrao);
		
		//APLICANDO DESCONTO
		DescontoFactory.nomeDoDesconto = desconto; //Qual a politica de desconto aplicar
		venda.precoDoCarrinhoComDesconto = 
				DescontoFactory.getInstance().getEstrategiaDesconto().calculaDesconto(venda);
		System.out.println("Valor com desconto é de R$"+ venda.precoDoCarrinhoComDesconto);
	}

}
