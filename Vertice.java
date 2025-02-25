import java.util.ArrayList;

public class Vertice<Obstaculos> {
    private Obstaculos obstaculos;
    private ArrayList<Aresta<Obstaculos>> arestasEntrada;
    private ArrayList<Aresta<Obstaculos>> arestasSaida;
    
    public Vertice(Obstaculos valor){
        this.obstaculos = valor;
        this.arestasEntrada = new ArrayList<Aresta<Obstaculos>>();
        this.arestasSaida = new ArrayList<Aresta<Obstaculos>>();
    }

    public Obstaculos getDado() {
        return obstaculos;
    }

    public void setDado(Obstaculos obstaculos) {
        this.obstaculos = obstaculos;
    }
    
    public void adicionarArestaEntrada(Aresta<Obstaculos> aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void adicionarArestaSaida(Aresta<Obstaculos> aresta){
        this.arestasSaida.add(aresta);
    }

    public ArrayList<Aresta<Obstaculos>> getArestasEntrada() {
        return arestasEntrada;
    }

    public ArrayList<Aresta<Obstaculos>> getArestasSaida() {
        return arestasSaida;
    }
    
    
}
