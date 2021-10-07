
package prova2.Model;

public class Comodo implements Componente {
    
    private double area;
    
    private String descricao;
    
    private double precoM2;

    public Comodo(double area, String descricao, double precoM2) {
        this.area = area;
        this.descricao = descricao;
        this.precoM2 = precoM2;
    }

    @Override
    public double calcularPreco() {
        return area * precoM2;
    }

    @Override
    public String toString(int qtdTabs) {
        StringBuilder sbTabs = new StringBuilder();
        for (int i = 0; i < qtdTabs; i++) {
            sbTabs.append("\t");
        }
        String tabs = sbTabs.toString();
        
        StringBuilder sb = new StringBuilder();
        sb.append(tabs).append("Descrição: ").append(descricao).append("\n");
        sb.append(tabs).append("Área(m²): ").append(String.format("%.2f", area)).append("\n");
        sb.append(tabs).append("Preço/m²(R$): ").append(String.format("%.2f", precoM2)).append("\n");
        sb.append(tabs).append("Valor(R$): ").append(String.format("%.2f", calcularPreco())).append("\n");
        return sb.toString();
    }
    
}
