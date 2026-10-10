public class DuplicateTeamNameFinder {
    public static String findDuplicateTeam(String[] names) {
        if (names == null) return "No Duplicates Found";
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) return "Duplicate Found: " + names[i];
            }
        }
        return "No Duplicates Found";
    }
    public static void main(String[] args) {
        System.out.println(findDuplicateTeam(new String[]{"ByteForce", "CodeCrafters", "ByteForce"}));
    }
}
