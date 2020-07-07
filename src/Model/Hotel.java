package Model;

public class Hotel {
    private String nome;
    private int avaliacao;
    private double taxaDiaDaSemanaNormal;
    private double taxaDiaDaSemanaFidelidade;
    private double taxaFimDeSemanaNormal;
    private double taxaFimDeSemanaFidelidade;

    public Hotel(String nome, int avaliacao, double taxaDiaDaSemanaNormal, double taxaDiaDaSemanaFidelidade,
                 double taxaFimDeSemanaNormal, double taxaFimDeSemanaFidelidade) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.taxaDiaDaSemanaNormal = taxaDiaDaSemanaNormal;
        this.taxaDiaDaSemanaFidelidade = taxaDiaDaSemanaFidelidade;
        this.taxaFimDeSemanaNormal = taxaFimDeSemanaNormal;
        this.taxaFimDeSemanaFidelidade = taxaFimDeSemanaFidelidade;
    }

    public String getNome() {
        return this.nome;
    }
    public int getAvaliacao() {
        return this.avaliacao;
    }
    public double getTaxaDiaDaSemanaNormal() {
        return this.taxaDiaDaSemanaNormal;
    }
    public double getTaxaDiaDaSemanaFidelidade() {
        return this.taxaDiaDaSemanaFidelidade;
    }
    public double getTaxaFimDeSemanaNormal(){
        return this.taxaFimDeSemanaNormal;
    }
    public double getTaxaFimDeSemanaFidelidade(){
        return this.taxaFimDeSemanaFidelidade;
    }
}
