package pz11;

public class LegacyDatabase {
    public void oldConnect() {
        System.out.println("Legacy DB connected");
    }

    public void oldDisconnect() {
        System.out.println("Legacy DB disconnected");
    }

    public String oldRunQuery(String sql) {
        System.out.println("Running legacy query: " + sql);
        return "Legacy result for: " + sql;
    }
}
