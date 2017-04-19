package com.viaflow.model;

import java.util.List;

public class Compra implements Comparable<Compra>{
	 public int compareTo(Compra outraConta) {
        if (new Double(this.valorTotal) < new Double(outraConta.valorTotal)) {
            return -1;
        }
        if (new Double(this.valorTotal) > new Double(outraConta.valorTotal)) {
            return 1;
        }
        return 0;
    }
	private String codigo;
	private String data;
	private String cliente;
	private String valorTotal;
	private List<CompraItem> itens;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<CompraItem> getItens() {
		return itens;
	}
	public void setItens(List<CompraItem> itens) {
		this.itens = itens;
	}
}