import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!codes.containsValue(country)) {
            codes.putIfAbsent(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (var entry : codes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (codes.containsValue(country)) {
            codes.remove(findDialingCode(country));
            codes.put(code, country);
        }
    }
}
