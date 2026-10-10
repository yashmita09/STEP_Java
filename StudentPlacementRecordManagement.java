public class StudentPlacementRecordManagement {
    static class PlacementRecord {
        String studentName, company; double packageLpa;
        public PlacementRecord(String s, String c, double p) {
            studentName = s; company = c; packageLpa = p;
        }
        public void printRecord() {
            System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
        }
    }
    public static void main(String[] args) {
        PlacementRecord[] recs = {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };
        for (PlacementRecord r : recs) r.printRecord();
    }
}
