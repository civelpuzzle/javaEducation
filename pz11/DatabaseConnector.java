package pz11;

public interface DatabaseConnector {
    void connect();
    void disconnect();
    String executeQuery(String query);
}
