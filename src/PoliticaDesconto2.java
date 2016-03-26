/**
 * @author Bruno Garcia 	Matricula: 029141072
 * @author Tamires Ferreira Matricula: 029131052
 */
public class PoliticaDesconto2 implements iCalculaDesconto{

	@Override
	public double calculaDesconto(Venda v) {
		if(v.getPrecoDoCarrinho()>10){
			return v.getPrecoDoCarrinho() - 1;
		}
		return v.getPrecoDoCarrinho();
	}

}
