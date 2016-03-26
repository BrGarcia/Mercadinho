/**
 * @author Bruno Garcia 	Matricula: 029141072
 * @author Tamires Ferreira Matricula: 029131052
 */
public class PoliticaDesconto1 implements iCalculaDesconto{

	@Override
	public double calculaDesconto(Venda v) {
		return v.getPrecoDoCarrinho() * 0.9;
	}

}
