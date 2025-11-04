package pz11;

public class LegacyDatabaseAdapter implements DatabaseConnector{
    private final LegacyDatabase legacyDatabase;

    public LegacyDatabaseAdapter(LegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }

    @Override
    public void connect() {
        legacyDatabase.oldConnect();
    }

    @Override
    public void disconnect() {
        legacyDatabase.oldDisconnect();
    }

    @Override
    public String executeQuery(String query) {
        return legacyDatabase.oldRunQuery(query);
    }
}
