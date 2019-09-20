package m09.dam2.jaumebalmes.net.vehicle;

public class Camions extends Vehicles{
    private int pes;

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public Camions(int velocitatMaxima, int numEixos, int numRodes, int pes) {
        super(velocitatMaxima, numEixos, numRodes);
        this.pes = pes;

    }
}
