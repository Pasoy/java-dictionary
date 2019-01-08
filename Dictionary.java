import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	/**
	 * Map with Strings as keys and values
	 */
	private HashMap<String, String> map = new HashMap<>();

	/**
	 * Puts two strings into the map, but checks if the strings are valid
	 * @param e
	 * @param d
	 */
	public void put(String e, String d) {
		if (e == null || d == null || e.length() == 0 || d.length() == 0)
			throw new IllegalArgumentException("String is not valid");
		map.put(e, d);
	}

	/**
	 * Returns the value to the requested key e
	 * @param e
	 * @return value to the key e
	 */
	public String get(String e) {
		if (!map.containsKey(e))
			return null;
		String d = "";
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if (key.equals(e)) {
				d = value;
			}
		}
		return d;
	}

	/**
	 * Removes the given String e
	 * @param e
	 * @return value to the key e
	 */
	public String remove(String e) {
		if (!map.containsKey(e))
			return null;
		String d = get(e);
		map.remove(e);
		return d;
	}

	/**
	 * Returns boolean if the given String exists
	 * @param s
	 * @return true or false
	 */
	public boolean contains(String s) {
		if (map.containsKey(s) || map.containsValue(s))
			return true;
		return false;
	}

	/**
	 * Returns size of the HashMap
	 * @return
	 */
	public int size() {
		return map.size();
	}

	/**
	 * Checks for the longest key in the map
	 * @return longestKey
	 */
	public String longestKey() {
		return longest(map, true);
	}

	/**
	 * Checks for the longest value in the map
	 * @return longestValue
	 */
	public String longestValue() {
		return longest(map, false);
	}
	
	/**
	 * Simply prints the keys and values of the map
	 */
	public void print() {
		map.forEach((k, v) -> System.out.println(k + " - " + v));
	}

	private String longest(HashMap<String, String> map, boolean key) {
		if (key) {
			String res = "";
			int sh = 0;
			for (Map.Entry<String, String> entry : map.entrySet()) {
				String key1 = entry.getKey();
				if (key1.length() > sh) {
					res = key1;
					sh = key1.length();
				}
			}
			return res;
		} else {
			String res = "";
			int sh = 0;
			for (Map.Entry<String, String> entry : map.entrySet()) {
				String value = entry.getValue();
				if (value.length() > sh) {
					res = value;
					sh = value.length();
				}
			}
			return res;
		}
	}

}
