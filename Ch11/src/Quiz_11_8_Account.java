public class Quiz_11_8_Account {
    double rate;
    String name;
    int id;
    double cost;
    double store;
    Quiz_11_Transaction transaction;

    Quiz_11_8_Account(){

    }

    Quiz_11_8_Account(String name, int id, double cost, double store, double rate, Quiz_11_Transaction transaction){
        this.name = name;
        this.cost = cost;
        this.id = id;
        this.store = store;
        this.rate = rate;
        this.transaction = transaction;
    }
}
