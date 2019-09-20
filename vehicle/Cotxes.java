package m09.dam2.jaumebalmes.net.vehicle;

public class Cotxes extends Vehicles{
    private int numFileresSeients;

    public int getNumFileresSeients() {
        return numFileresSeients;
    }

    public void setNumFileresSeients(int numFileresSeients) {
        this.numFileresSeients = numFileresSeients;
    }

    public Cotxes(int velocitatMaxima, int numEixos, int numRodes, int numFileresSeients) {
        super(velocitatMaxima, numEixos, numRodes);
        this.numFileresSeients = numFileresSeients;

    }
}
