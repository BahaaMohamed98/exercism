import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return myCollection.stream().anyMatch(s -> !theirCollection.contains(s)) &&
                theirCollection.stream().anyMatch(s -> !myCollection.contains(s));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.getFirst());

        for (int i = 1; i < collections.size(); i++) {
            common.retainAll(collections.get(i));
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        for (Set<String> set : collections) {
            all.addAll(set);
        }

        return all;
    }
}
