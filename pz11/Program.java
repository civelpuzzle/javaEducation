package pz11;

public class Program {
    public static void main(String[] args) {
        LegacyDatabase legacy = new LegacyDatabase();
        DatabaseConnector adapter = new LegacyDatabaseAdapter(legacy);

        adapter.connect();
        String result = adapter.executeQuery("SELECT * FROM users");
        System.out.println("Query result: " + result);
        adapter.disconnect();
    }
}

