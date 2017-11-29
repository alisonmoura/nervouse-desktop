package br.com.nervouse.model;

import java.util.Arrays;

public class Venda extends Model{

	private Item[] itens;
	private Double total;
	private PagamentoEnum formaPagamento;
	private Cliente cliente;
	private Vendedor vendedor;

	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public PagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(PagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
		result = prime * result + Arrays.hashCode(itens);
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime * result + ((vendedor == null) ? 0 : vendedor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (formaPagamento != other.formaPagamento)
			return false;
		if (!Arrays.equals(itens, other.itens))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (vendedor == null) {
			if (other.vendedor != null)
				return false;
		} else if (!vendedor.equals(other.vendedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Venda [itens=" + Arrays.toString(itens) + ", total=" + total + ", formaPagamento=" + formaPagamento
				+ ", cliente=" + cliente + ", vendedor=" + vendedor + "]";
	}

}
