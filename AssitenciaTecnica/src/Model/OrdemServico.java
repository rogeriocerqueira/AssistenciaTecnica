package Model;

import java.util.Date;

public class OrdemServico {
    private int id;
    private Date inicio;
    private Date finalizado;
    private int clienteId;
    private String  tipo;
    private double preco;
    private String tipoPagamento;
    private int notaSatisfacao;
    private String status;
    private Date tempoGasto;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Date finalizado) {
        this.finalizado = finalizado;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getNotaSatisfacao() {
        return notaSatisfacao;
    }

    public void setNotaSatisfacao(int notaSatisfacao) {
        this.notaSatisfacao = notaSatisfacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(Date tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
