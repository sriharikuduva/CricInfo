import metadata.Person;

public class Player extends Person {
    private ArrayList<PlayerContract> contracts;

    public void addContract(PlayerContract contract) {
        contracts.add(contract);
    }

    public ArrayList<PlayerContract> getContracts() {
        return contracts;
    }
    public void setContracts(ArrayList<PlayerContract> contracts) {
        this.contracts = contracts;
    }
}