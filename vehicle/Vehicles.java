package m09.dam2.jaumebalmes.net.vehicle;

public class Vehicles {
    private int velocitatMaxima;
    private int numEixos;
    private int numRodes;

    public int getVelocitatMaxima() {
        return velocitatMaxima;
    }

    public void setVelocitatMaxima(int velocitatMaxima) {
        this.velocitatMaxima = velocitatMaxima;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public void setNumRodes(int numRodes) {
        this.numRodes = numRodes;
    }

    public Vehicles(int velocitatMaxima, int numEixos, int numRodes) {
        this.velocitatMaxima = velocitatMaxima;
        this.numEixos = numEixos;
        this.numRodes = numRodes;

    }
}
