package modelo_principal;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List <ItensDoCarrinho> itens = new ArrayList<ItensDoCarrinho>();
	private double valorTotal;
	private double valorFrete;
	
	public List<ItensDoCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItensDoCarrinho> itens) {
		this.itens = itens;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	@Override
	public String toString() {
		return "Carrinho [itens=" + itens + "]";
	}

	//vamos trabalhar de inicio apenas com uma forma de envio e com apenas 1 CEp
	public double calculaFrete(String cep) {
		
		double frete = 0;
		
		switch (cep) {
		case "26.582.030":
			frete = 50.00;
			break;

		default:
			break;
		}
		return frete;
	}
	

	//método de calcular a soma dos itens do carrinho e setar eles como estaticos a menos que um item seja adicionado um novo item, o que gera um novo calculo
}
