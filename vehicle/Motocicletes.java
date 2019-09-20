package m09.dam2.jaumebalmes.net.vehicle;

public class Motocicletes extends Vehicles {
    private boolean copilot;

    public boolean isCopilot() {
        return copilot;
    }

    public void setCopilot(boolean copilot) {
        this.copilot = copilot;
    }

    public Motocicletes(int velocitatMaxima, int numEixos, int numRodes, boolean copilot) {
        super(velocitatMaxima, numEixos, numRodes);
        this.copilot = copilot;

    }
}
